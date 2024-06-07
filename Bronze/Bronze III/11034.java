import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int A, B, C, left, right;
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            if (str.equals("")) {
                break;
            }

            st = new StringTokenizer(str);

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            left = B - A - 1;
            right = C - B - 1;

            sb.append(Math.max(left, right)).append("\n");
        }
        System.out.println(sb);
    }
}