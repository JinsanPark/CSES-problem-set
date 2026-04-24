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
            int n = 0;
            int a = 1;

            if (x > y) {
                n = x;
            } else {
                n = y;
            }

            for (int j = 1; j < n; j++) {
                a += j * 2;
            }

            if (n % 2 == 0) {
                if (x < n) {
                    a -= 1;
                } else if (y < n) {
                    a += 1;
                }
            } else {
                if (x < n) {
                    a += 1;
                } else if (y < n) {
                    a -= 1;
                }
            }

            sb.append(a).append("\n");

        }

        System.out.println(sb);

    }
}
//풀이중