import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String referenceDate = "2023-09-17";

        if (input.compareTo(referenceDate) < 0) {
            sb.append("GOOD");
        } else {
            sb.append("TOO LATE");
        }

        System.out.println(sb);
    }
}