import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] before, after;

        int n = Integer.parseInt(br.readLine());

        before = br.readLine().split("");
        after = br.readLine().split("");

        if (n % 2 == 1) {
            for (int i = 0; i < before.length; i++) {
                if (before[i].equals("1")) {
                    before[i] = "0";
                } else {
                    before[i] = "1";
                }
            }
        }

        sb.append(Arrays.equals(before, after) ? "Deletion succeeded" : "Deletion failed");
        System.out.println(sb);
    }
}