import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int[] alpha;
        String str = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine().toLowerCase().replaceAll("[^a-z]", "");
            alpha = new int[26];
            flag = true;

            for (int j = 0; j < str.length(); j++) {
                alpha[str.charAt(j) - 'a']++;
            }

            for (int k = 0; k < 26; k++) {
                if (alpha[k] == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("pangram\n");
            } else {
                sb.append("missing ");

                for (int l = 0; l < 26; l++) {
                    if (alpha[l] == 0) {
                        sb.append((char) (l + 'a'));
                    }
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}