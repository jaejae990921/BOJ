import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "WelcomeToSMUPC";

        int N = Integer.parseInt(br.readLine());

        sb.append(str.charAt((N - 1) % 14));
        System.out.println(sb);
    }
}