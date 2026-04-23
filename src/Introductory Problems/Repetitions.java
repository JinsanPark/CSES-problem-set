import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repetitions {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        char[] line = inputLine.toCharArray();
        int n = line.length;
        int curCount = 1;
        int biggestCount = 0;

        for (int i = 0; i < n; i++) {

            if (i < n - 1 && line[i] == line[i + 1]) {

                curCount++;

            } else {

                curCount = 1;

            }

            if (curCount > biggestCount) {

                biggestCount = curCount;

            }

        }

        System.out.println(biggestCount);


    }

}


//소요시간 0.18s