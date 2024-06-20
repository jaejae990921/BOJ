import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[3];
        int idx = 0, num = 0;

        for (int i = 0; i < 3; i++) {
            arr[i] = br.readLine();
        }

        for (int j = 0; j < 3; j++) {
            if (!arr[j].contains("z")) {
                num = Integer.parseInt(arr[j]);
                idx = j;
            }
        }

        num += (idx == 0) ? 3 : (idx == 1) ? 2 : 1;

        if (num % 3 == 0 && num % 5 == 0) {
            sb.append("FizzBuzz");
        } else if (num % 3 == 0) {
            sb.append("Fizz");
        } else if (num % 5 == 0) {
            sb.append("Buzz");
        } else {
            sb.append(num);
        }

        System.out.println(sb);
    }
}