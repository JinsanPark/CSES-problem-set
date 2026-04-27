import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            long n = 0;
            long a = 1;

            if (x > y) {
                n = x;
            } else {
                n = y;
            }

            a = n * n - n + 1;

            if (n % 2 == 0) {
                if (x < n) {
                    a -= n - x;
                } else if (y < n) {
                    a += n - y;
                }
            } else {
                if (x < n) {
                    a += n - x;
                } else if (y < n) {
                    a -= n - y;
                }
            }

            sb.append(a).append("\n");

        }

        System.out.println(sb);

    }
}
