import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int year = 2024;
        int month = 8;

        int N = Integer.parseInt(br.readLine()) - 1;

        int temp = (month - 1) + (N * 7);

        year = year + (temp / 12);
        month = (temp % 12) + 1;

        sb.append(year).append(" ").append(month);
        System.out.println(sb);
    }
}