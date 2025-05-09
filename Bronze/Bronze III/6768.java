import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        int J = Integer.parseInt(br.readLine());
        
        sb.append((J-3) * (J-2) * (J-1) / 6);
        System.out.print(sb);
    }
}
