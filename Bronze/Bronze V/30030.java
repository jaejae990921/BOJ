import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int B = Integer.parseInt(br.readLine());
        int A = (int)(B - (B / 11));
        
        sb.append(A);
        System.out.println(sb);
    }
}
