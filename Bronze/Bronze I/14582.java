import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int jemiSum = 0, starSum = 0;

        String[] jemi = br.readLine().split(" ");
        String[] star = br.readLine().split(" ");

        for (int i = 0; i < 9; i++) {
            jemiSum += Integer.parseInt(jemi[i]);

            if (jemiSum > starSum) {
                flag = true;
                break;
            }

            starSum += Integer.parseInt(star[i]);
        }

        sb.append(flag ? "Yes" : "No");
        System.out.println(sb);
    }
}