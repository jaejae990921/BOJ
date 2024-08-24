import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        int need;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        if (game == 'Y') {
            need = 1;
        } else if (game == 'F') {
            need = 2;
        } else {
            need = 3;
        }

        sb.append(set.size() / need);
        System.out.println(sb);
    }
}