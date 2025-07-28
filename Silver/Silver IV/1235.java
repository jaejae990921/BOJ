import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        String sub = "";
        int answer = 0;

        int N = Integer.parseInt(br.readLine());
        String[] origin = new String[N];

        for (int i = 0; i < N; i++) {
            origin[i] = br.readLine();
        }

        int maxLen = origin[0].length();

        for (int j = 1; j <= maxLen; j++) {
            set.clear();

            for (int k = 0; k < N; k++) {
                sub = origin[k].substring(origin[k].length() - j);
                set.add(sub);
            }

            if (set.size() == N) {
                answer = j;
                break;
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}