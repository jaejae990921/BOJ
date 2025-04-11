import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N, M;
 
        int T = Integer.parseInt(br.readLine());
         
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
             
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
             
            if (N < 12 || M < 4 ) {
                sb.append(-1);
            } else {
                sb.append(11*M+4);
            }
             
            sb.append("\n");
        }
         
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}