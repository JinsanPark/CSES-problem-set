import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(" ");

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            sb.append(n).append(" ");
        }

        System.out.println(sb);

    }
}


//System.out.println(sb.toString().trim());

//sb.append(n);  // 첫 값은 공백 없이
//while (n != 1) {
//        if (n % 2 == 0) n /= 2;
//        else n = n * 3 + 1;
//        sb.append(" ").append(n);  // 다음 값들은 공백을 앞에 붙임
//}

//long n = Long.parseLong(br.readLine());