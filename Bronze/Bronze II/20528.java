import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        char temp, ch;

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ch = st.nextToken().charAt(0);

        for (int i = 1; i < N; i++) {
            temp = st.nextToken().charAt(0);

            if (ch != temp) {
                flag = false;
                break;
            }
        }

        sb.append(flag ? "1" : "0");
        System.out.println(sb);
    }
}