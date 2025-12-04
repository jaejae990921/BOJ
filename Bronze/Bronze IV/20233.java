import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int aBicycle = a + Math.max(0, (T - 30) * 21 * x);
        int bBicycle = b + Math.max(0, (T - 45) * 21 * y);

        sb.append(aBicycle).append(" ").append(bBicycle);
        System.out.println(sb);
    }
}