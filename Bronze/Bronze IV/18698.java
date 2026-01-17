import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        int cnt = 0;

        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            str = br.readLine();
            cnt = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'D') {
                    break;
                }
                cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
