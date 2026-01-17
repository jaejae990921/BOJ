import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] maxScore = { 100, 100, 200, 200, 300, 300, 400, 400, 500 };
        int score = 0, sum = 0;
        boolean flag = false;
        String answer = "";

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 9; i++) {
            score = Integer.parseInt(st.nextToken());
            sum += score;

            if (score > maxScore[i]) {
                flag = true;
            }
        }

        if (flag) {
            answer = "hacker";
        } else if (sum >= 100) {
            answer = "draw";
        } else {
            answer = "none";
        }

        sb.append(answer);
        System.out.println(sb);
    }
}