import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] arr = input.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        int c = Integer.parseInt(arr[4]);

        if (a + b == c) {
            sb.append("YES");
        } else {
            sb.append("NO");
        }

        System.out.println(sb);
    }
}