import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alphabet = { 3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1 };

        String A = br.readLine();
        String B = br.readLine();

        int[] score = new int[A.length() + B.length()];

        for (int i = 0; i < score.length - 1; i += 2) {
            score[i] = alphabet[A.charAt(i / 2) - 'A'];
            score[i + 1] = alphabet[B.charAt(i / 2) - 'A'];
        }

        int len = score.length;

        while (len > 2) {
            for (int i = 0; i < len - 1; i++) {
                score[i] = (score[i] + score[i + 1]) % 10;
            }
            len--;
        }

        sb.append(score[0]).append(score[1]);
        System.out.println(sb);
    }
}