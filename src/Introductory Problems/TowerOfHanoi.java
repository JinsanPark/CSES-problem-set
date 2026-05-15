import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TowerOfHanoi {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = (1 << n) - 1;
        hanoi(1,2,3,n);

        System.out.println(result);
        System.out.println(sb);

    }

    public static void hanoi(int depart, int via, int arrive, int n) {

        if (n == 0) {
           return;
        }

        hanoi(depart,arrive,via, n - 1);

        sb.append(depart).append(" ").append(arrive).append("\n");

        hanoi(via, depart, arrive, n - 1);

    }

}
