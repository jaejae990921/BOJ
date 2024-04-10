import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<String>();
        ArrayList<String> list = new ArrayList<String>();
        int cnt = 0;
        String name;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            name = br.readLine();

            if (set.contains(name)) {
                cnt++;
                list.add(name);
            }
        }

        sb.append(cnt).append('\n');

        list.sort(null);

        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}