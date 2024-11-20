import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str, copy, temp;
        int cnt, len;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            str = st.nextToken();
            copy = st.nextToken();
            temp = str.replace(copy, "");

            len = str.length() - temp.length();
            cnt = len / copy.length();

            sb.append(temp.length() + cnt).append("\n");
        }

        System.out.println(sb);
    }
}