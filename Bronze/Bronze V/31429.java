import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] solve = new int[] { 12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6 };
        int[] sum = new int[] { 1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773 };

        int N = Integer.parseInt(br.readLine());

        sb.append(solve[N - 1]).append(" ").append(sum[N - 1]);
        System.out.println(sb);
    }
}