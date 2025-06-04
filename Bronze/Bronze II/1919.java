import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        int cnt = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        String str2 = br.readLine();

        for (int i = 0; i < str2.length(); i++) {
            arr2[str2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != arr2[i]) {
                cnt += Math.abs(arr[i] - arr2[i]);
            }
        }

        sb.append(cnt);
        System.out.print(sb);
    }
}