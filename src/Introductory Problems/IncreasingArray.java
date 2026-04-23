import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] line = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            line[i] = Integer.parseInt(st.nextToken());

        }

        long count = 0;

        for (int i = 1; i < n; i++) {
            if (line[i - 1] > line[i]) {

                int sub = line[i - 1] - line[i];
                count += sub;
                line[i] += sub;

            }
        }

        System.out.println(count);

    }
}
