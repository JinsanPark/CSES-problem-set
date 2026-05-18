import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class CreatingStrings {
    public static void main(String[] arg) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringBuilder sb = new StringBuilder();
        int length = line.length();
        char[] arr = line.toCharArray();
        int[] alpCount = new int[27];

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i] - 'a';
            alpCount[a]++;
        }

        int maxCount = factorial(line.length());

        for (int i = 0; i < 27; i++) {
            if (alpCount[i] > 1) {
             maxCount /= factorial(alpCount[i]);
            }
        }

        sb.append(maxCount).append("\n");
        creatingStrings(length, arr, alpCount, maxCount);

    }

    public static void creatingStrings (int length, char[] arr, int[] alpCount, int maxCount) {

        Deque<String> stack = new ArrayDeque<>();

        if (stack.size() == length) {
            return;
        }



    }

    public static int factorial (int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }


}
