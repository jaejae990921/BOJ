import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long sum = 0;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        String[] arr = str.split("[a-zA-Z]");

        for (String s : arr) {
            if (!s.equals("")) {
                sum += Integer.parseInt(s);
            }
        }

        sb.append(sum);
        System.out.println(sb);
    }
}