import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countAlphabet = new int[26];
        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {

            char c = line.charAt(i);
            countAlphabet[c - 'A']++;

        }

        int countOdd = 0;

        for (int i = 0; i < countAlphabet.length; i++) {
            if (countAlphabet[i] % 2 == 1) {
                countOdd++;
            }
        }

        if (countOdd >= 2) {
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countAlphabet.length; i++) {

            char alphabet = (char) (i + 'A');

            if (countAlphabet[i] % 2 == 0) {
                for (int j = 0; j < countAlphabet[i] / 2; j++) {
                    sb.append(alphabet);
                }
            }
        }

        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.reverse();

        for (int i = 0; i < countAlphabet.length; i++) {

            char alphabet = (char) (i + 'A');

            if (countAlphabet[i] % 2 == 1) {
                for (int j = 0; j < countAlphabet[i]; j++) {
                    sb.append(alphabet);
                }
            }
        }

        sb.append(sb2);

        System.out.println(sb);

    }
}
