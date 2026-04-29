import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigString01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long modulo = 1000000007L;
        long result = 1L;

        for (int i = 0; i < n; i++) {

            result = (2L * result) % modulo;

        }

        System.out.println(result);

    }
}
