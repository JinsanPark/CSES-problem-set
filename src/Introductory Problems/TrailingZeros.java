import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeros {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int square = 5;
        int result = n / 5;

        while (n >= square) {
            result += n / (square * 5);
            square *= 5;
        }

        System.out.println(result);

    }
}
