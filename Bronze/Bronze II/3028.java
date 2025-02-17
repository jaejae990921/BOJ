import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int temp;
        char ch;

        String operation = br.readLine();
        int[] arr = new int[3];
        arr[0] = 1;

        for (int i = 0; i < operation.length(); i++) {
            ch = operation.charAt(i);

            if (ch == 'A') {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            } else if (ch == 'B') {
                temp = arr[1];
                arr[1] = arr[2];
                arr[2] = temp;
            } else {
                temp = arr[0];
                arr[0] = arr[2];
                arr[2] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (arr[i] == 1) {
                sb.append(i + 1);
                break;
            }
        }

        System.out.println(sb);
    }
}