import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrayCode {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int nSquare = 1 << n;

        for (int i = 0; i < nSquare; i++) {

            int target = i ^ (i >> 1);
            StringBuilder biStr = new StringBuilder(Integer.toBinaryString(target));

            for (int j = biStr.length(); j < n; j++) {
                biStr.insert(0, "0");
            }

            sb.append(biStr);
            sb.append("\n");

        }

        System.out.println(sb);

    }
}
