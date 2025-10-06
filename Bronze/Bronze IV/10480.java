import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x = 0;
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());

            if (x % 2 == 0) {
                sb.append(x).append(" is even\n");
            } else {
                sb.append(x).append(" is odd\n");
            }
        }
        
        System.out.println(sb);
    }
}
