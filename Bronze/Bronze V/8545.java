import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        
		System.out.println(sb);
	}
}
