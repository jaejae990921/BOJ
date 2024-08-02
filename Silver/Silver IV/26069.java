import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<String>();
        StringTokenizer st;
        String A, B;

        int N = Integer.parseInt(br.readLine());

        set.add("ChongChong");

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            A = st.nextToken();
            B = st.nextToken();

            if (set.contains(A) || set.contains(B)) {
                set.add(A);
                set.add(B);
            }
        }

        sb.append(set.size());
        System.out.println(sb);
    }
}