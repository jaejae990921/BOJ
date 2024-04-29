import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][] students = new int[2][6];
        int sex, grade, cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int student = Integer.parseInt(st.nextToken());
        Double max = Double.parseDouble(st.nextToken());

        for (int i = 0; i < student; i++) {
            st = new StringTokenizer(br.readLine());

            sex = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken()) - 1;

            students[sex][grade]++;
        }

        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 2; k++) {
                cnt += Math.ceil(students[k][j] / max);
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}