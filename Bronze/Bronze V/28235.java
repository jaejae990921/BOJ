import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        switch (input) {
            case "SONGDO":
                sb.append("HIGHSCHOOL");
                break;
            case "CODE":
                sb.append("MASTER");
                break;
            case "2023":
                sb.append("0611");
                break;
            case "ALGORITHM":
                sb.append("CONTEST");
                break;
        }

        System.out.println(sb);
    }
}