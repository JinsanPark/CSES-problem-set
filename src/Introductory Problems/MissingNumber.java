import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MissingNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            hs.add(i);
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int m = Integer.parseInt(st.nextToken());
            hs.remove(m);
        }

        for (int num : hs) {
            System.out.println(num);
        }

    }
}