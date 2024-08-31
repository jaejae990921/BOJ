import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<String>();
        String str;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            if (str.equals("ENTER")) {
                cnt += set.size();
                set.clear();
            } else {
                set.add(str);
            }
        }

        sb.append(cnt + set.size());
        System.out.println(sb);
    }
}