import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String Adrian = "ABC", Bruno = "BABC", Goran = "CCAABB";
        int aCnt = 0, bCnt = 0, gCnt = 0;

        int N = Integer.parseInt(br.readLine());
        String answer = br.readLine();

        for (int i = 0; i < N; i++) {
            if (answer.charAt(i) == Adrian.charAt(i % 3))
                aCnt++;
            if (answer.charAt(i) == Bruno.charAt(i % 4))
                bCnt++;
            if (answer.charAt(i) == Goran.charAt(i % 6))
                gCnt++;
        }

        int max = Math.max(aCnt, Math.max(bCnt, gCnt));

        sb.append(max).append("\n");

        if (aCnt == max)
            sb.append("Adrian").append("\n");
        if (bCnt == max)
            sb.append("Bruno").append("\n");
        if (gCnt == max)
            sb.append("Goran").append("\n");

        System.out.println(sb);
    }
}