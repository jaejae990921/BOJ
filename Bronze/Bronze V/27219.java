import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int five = n / 5;
        int one = n % 5;

        for (int i = 0; i < five; i++) {
            sb.append("V");
        }

        for (int i = 0; i < one; i++) {
            sb.append("I");
        }

        System.out.println(sb);
    }
}