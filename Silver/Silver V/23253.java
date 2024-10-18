import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int book, prev, next;
        boolean flag = true;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            book = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            prev = Integer.parseInt(st.nextToken());

            for (int j = 0; j < book - 1; j++) {
                next = Integer.parseInt(st.nextToken());

                if (prev < next) {
                    flag = false;
                } else {
                    prev = next;
                }
            }
        }

        sb.append(flag ? "Yes" : "No");
        System.out.println(sb);
    }
}