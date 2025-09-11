import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int apple = Integer.parseInt(br.readLine());
        int mandarin = Integer.parseInt(br.readLine());

        sb.append(apple + mandarin + 3);
        System.out.println(sb);
    }
}