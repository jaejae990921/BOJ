import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            input = br.readLine();
            
            if (input.contains("S")) {
                sb.append(input);
                break;   
            }
        }
        
        System.out.println(sb);
    }
}
