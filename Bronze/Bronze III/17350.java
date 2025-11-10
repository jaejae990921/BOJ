import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        String input = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine();

            if (input.equals("anj")) {
                flag = true;
            }
        }

        sb.append(flag ? "뭐야;" : "뭐야?");
        System.out.println(sb);
    }
}