import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int max = 0;
        int min = 0;

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }

            if ((max + min) % 3 == 0) {
                if (max <= 2 * min) {
                    sb.append("YES");
                } else {
                    sb.append("NO");
                }
            } else {
                sb.append("NO");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
