import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(str.charAt(i) - '0', 5);
        }

        System.out.println(sum);
    }
}