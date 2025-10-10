import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        
        int twoCnt = str.replaceAll("e", "").length();
        int eCnt = str.replaceAll("2", "").length();
        
        if (twoCnt == eCnt) {
            sb.append("yee");
        } else if (twoCnt > eCnt) {
            sb.append("2");
        } else {
            sb.append("e");
        }
        
        System.out.println(sb);
    }
}
