import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str, answer = "";
        int max = 0;

        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    arr[c - 'a']++;
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                answer += (char) (i + 'a');
            }
        }

        System.out.println(answer);
    }
}