import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double num;

        double first = Double.parseDouble(br.readLine());

        while (true) {
            num = Double.parseDouble(br.readLine());
            if (num == 999) {
                break;
            }
            sb.append(String.format("%.2f\n", num - first));
            first = num;
        }

        System.out.println(sb);
    }
}