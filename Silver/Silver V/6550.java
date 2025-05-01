import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "", s = "", t = "";
        int sidx = 0, tidx = 0;

        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            s = st.nextToken();
            t = st.nextToken();

            sidx = 0;
            tidx = 0;

            while (sidx < s.length() && tidx < t.length()) {
                if (s.charAt(sidx) == t.charAt(tidx)) {
                    sidx++;
                    tidx++;
                } else {
                    tidx++;
                }
            }

            sb.append(sidx == s.length() ? "Yes\n" : "No\n");
        }

        System.out.println(sb);
    }
}