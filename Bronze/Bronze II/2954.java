import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String answer = br.readLine().replace("apa", "a")
                .replace("epe", "e")
                .replace("ipi", "i")
                .replace("opo", "o")
                .replace("upu", "u");

        sb.append(answer);
        System.out.println(sb);
    }
}