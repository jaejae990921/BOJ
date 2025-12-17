import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        char ch = input.charAt(0);

        switch (ch) {
            case 'F':
                sb.append("Foundation");
                break;
            case 'C':
                sb.append("Claves");
                break;
            case 'V':
                sb.append("Veritas");
                break;
            case 'E':
                sb.append("Exploration");
                break;
        }

        System.out.println(sb);
    }
}