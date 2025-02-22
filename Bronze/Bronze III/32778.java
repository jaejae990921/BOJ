import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();
        
        if (str.contains("(")) {
            StringTokenizer st = new StringTokenizer(str, "(");
            String real = st.nextToken();
            String sub = st.nextToken();
            sub = sub.replace(")", "");
            
            sb.append(real).append("\n").append(sub);
        } else {
            sb.append(str).append("\n").append("-");
        }

        System.out.println(sb);
    }
}
