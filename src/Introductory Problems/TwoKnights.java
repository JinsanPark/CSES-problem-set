import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoKnights {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 2;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n ; i++) {

            long square = (long)i * i;


            //분기가 정말 필요한지 다시 한번 생각해 볼 것.
            if (i == 1) {
                sb.append(0).append("\n");
            } else if (i == 2) {
                sb.append( square * (square - 1) / 2 ).append("\n");
            } else {
                sb.append( (square * (square - 1) / 2) - ((long) x * (x + 2)) ).append("\n");
                x += 2;
            }

        }

        System.out.println(sb);

    }
}
