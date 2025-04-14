import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), "*");

        Pattern p = Pattern.compile(st.nextToken() + ".*" + st.nextToken());

        for (int i = 0; i < N; i++) {
            input = br.readLine();

            if (p.matcher(input).matches()) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }

        System.out.println(sb);
    }
}