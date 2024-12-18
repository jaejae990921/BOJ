import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] noWord = { "i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili" };
        String answer = "", temp;
        boolean flag;

        StringTokenizer st = new StringTokenizer(br.readLine());

        answer += st.nextToken().charAt(0);

        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            flag = true;

            for (String str : noWord) {
                if (temp.equals(str)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                answer += temp.charAt(0);
            }
        }

        sb.append(answer.toUpperCase());
        System.out.println(sb);
    }
}