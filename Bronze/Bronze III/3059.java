import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum;
        String s;
        Boolean[] arr;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sum = 2015;
            arr = new Boolean[26];
            s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (arr[s.charAt(j) - 'A'] == null) {
                    arr[s.charAt(j) - 'A'] = true;
                    sum -= s.charAt(j);
                }
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}