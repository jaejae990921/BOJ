import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "LoveisKoreaUniversity ";

        int N = Integer.parseInt(br.readLine());
        String answer = str.repeat(N);

        sb.append(answer.trim());
        System.out.println(sb);
    }
}