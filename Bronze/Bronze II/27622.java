import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        String input;
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            input = st.nextToken();

            if (input.charAt(0) == '-') {
                if (!(list.remove(input.substring(1)))) {
                    cnt++;
                }
            } else {
                list.add(input);
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}