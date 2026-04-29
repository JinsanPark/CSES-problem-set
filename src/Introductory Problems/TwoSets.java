import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSets {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = (long) n * (n + 1) / 2;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int count1 = 0;
        int count2 = 0;


        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        } else {

            long target = sum / 2;

            for (int i = n; i > 0 ; i--) {

                if (target >= i) {
                    sb1.append(i).append(" ");
                    target -= i;
                    count1++;
                } else {
                    sb2.append(i).append(" ");
                    count2++;
                }

            }

        }

        sb1.deleteCharAt(sb1.length() - 1);
        sb2.deleteCharAt(sb2.length() - 1);

        StringBuilder answer = new StringBuilder();
        answer.append("YES").append("\n");
        answer.append(count1).append("\n");
        answer.append(sb1).append("\n");
        answer.append(count2).append("\n");
        answer.append(sb2);

        System.out.println(answer);

    }
}
