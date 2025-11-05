import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int X = Integer.parseInt(br.readLine());
        
        if (X % 7 == 2) {
            sb.append(1);
        } else {
            sb.append(0);
        }
        
        System.out.println(sb);
    }
}
