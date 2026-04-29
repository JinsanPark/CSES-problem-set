import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[n];
        boolean isEvenToOdd = false;
        boolean check = true;
        int input = 2;
        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            System.out.println(1);
            check = false;
        } else {


            for (int i = 0; i < n; i++) {

                line[i] = input;
                sb.append(input).append(" ");
                input += 2;

                if (isEvenToOdd && Math.abs(line[i] - line[i - 1]) == 1) {
                    System.out.println("NO SOLUTION");
                    check = false;
                    break;
                }

                if (input > n) {
                    input = 1;
                    isEvenToOdd = true;
                }

            }
        }

        if (check) {
            System.out.println(sb);
        }

    }
}
