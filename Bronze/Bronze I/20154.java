import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = { 3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1 };
        int answer = 0;
        int ch;

        char[] s = br.readLine().toCharArray();

        for (int i = 0; i < s.length; i++) {
            ch = s[i] - 'A';
            answer += arr[ch];
        }

        sb.append(answer % 2 == 0 ? "You're the winner?" : "I'm a winner!");
        System.out.print(sb);
    }
}