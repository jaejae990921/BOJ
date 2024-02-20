import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        char[] arr = { '/', '-', '\\', '(', '@', '?', '>', '&', '%' }; // -1 ~ 7
        int sum = 0, idx = 0;

        while ((str = br.readLine()) != null) {
            if (str.equals("#")) {
                break;
            }

            sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                idx = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (ch == arr[j]) {
                        idx = j;
                    }
                }

                idx -= 1;

                sum += Math.pow(8, str.length() - i - 1) * idx;
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}