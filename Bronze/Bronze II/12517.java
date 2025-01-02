import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        String name = "";
        char last;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            name = br.readLine();
            last = name.toLowerCase().charAt(name.length() - 1);

            sb.append("Case #" + i + ": " + name + " is ruled by ");
            
            if (last == 'y') {
                sb.append("nobody");
            } else if (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u') {
                sb.append("a queen");
            } else {
                sb.append("a king");
            }

            sb.append(".\n");
        }
        
		System.out.println(sb);
	}
}
