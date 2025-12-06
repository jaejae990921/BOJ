import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "", answer = "";
        int s = 0, e = 0;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            answer = "";
            
            input = st.nextToken();
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            for (int j = 0; j < input.length(); j++) {
                if (j < s || j >= e) {
                    answer += String.valueOf(input.charAt(j));
                }
            }

            sb.append(answer).append("\n");
        }
        
        System.out.println(sb);
    }
}
