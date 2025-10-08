import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "S";
        
        String input = br.readLine();
        
        if (input.contains("9")) {
            answer = "F";
        }
        
        sb.append(answer);
        System.out.println(sb);
    }
}
