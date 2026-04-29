import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BitStrings {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger modulo = BigInteger.TEN.pow(9);
        modulo = modulo.add(BigInteger.valueOf(7));
        BigInteger bitCount = BigInteger.TWO.pow(n);

        BigInteger result = bitCount.remainder(modulo);

        System.out.println(result);

    }

}
