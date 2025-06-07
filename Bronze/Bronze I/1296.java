import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = -1, score = 0, l = 0, o = 0, v = 0, e = 0;
        String answer = "";

        String str = br.readLine();

        int L = str.length() - str.replace("L", "").length();
        int O = str.length() - str.replace("O", "").length();
        int V = str.length() - str.replace("V", "").length();
        int E = str.length() - str.replace("E", "").length();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            l = str.length() - str.replace("L", "").length();
            o = str.length() - str.replace("O", "").length();
            v = str.length() - str.replace("V", "").length();
            e = str.length() - str.replace("E", "").length();

            score = calc(L + l, O + o, V + v, E + e);

            if (score > max) {
                max = score;
                answer = str;
            } else if (score == max) {
                if (str.compareTo(answer) < 0) {
                    answer = str;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }

    public static int calc(int l, int o, int v, int e) {
        return ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100;
    }
}