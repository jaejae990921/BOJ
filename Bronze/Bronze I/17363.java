import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    private static HashMap<Character, Character> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        init();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = M - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                sb.append(map.get(arr[j][i]));
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void init() {
        map.put('.', '.');
        map.put('O', 'O');
        map.put('-', '|');
        map.put('|', '-');
        map.put('/', '\\');
        map.put('\\', '/');
        map.put('^', '<');
        map.put('<', 'v');
        map.put('v', '>');
        map.put('>', '^');
    }
}