import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String op;
        int n = 0;

        HashSet<Integer> all = new HashSet<Integer>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        HashSet<Integer> set = new HashSet<Integer>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            op = st.nextToken();

            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            }

            switch (op) {
                case "add":
                    set.add(n);
                    break;
                case "remove":
                    set.remove(n);
                    break;
                case "check":
                    sb.append(set.contains(n) ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    if (set.contains(n)) {
                        set.remove(n);
                    } else {
                        set.add(n);
                    }
                    break;
                case "all":
                    set = new HashSet<Integer>(all);
                    break;
                case "empty":
                    set.clear();
                    break;
            }
        }

        System.out.println(sb);
    }
}