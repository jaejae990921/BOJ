import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> temp;
        int max = Integer.MIN_VALUE, t1, t2, t3;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            temp = new ArrayList<>();

            t1 = N;
            t2 = i;

            temp.add(t1);
            temp.add(t2);

            while (true) {
                t3 = t1 - t2;
                if (t3 < 0) {
                    break;
                }

                temp.add(t3);

                t1 = t2;
                t2 = t3;
            }

            if (max < temp.size()) {
                max = temp.size();
                answer = new ArrayList<>(temp);
            }
        }

        sb.append(max).append("\n");

        for (int j = 0; j < answer.size(); j++) {
            sb.append(answer.get(j)).append(" ");
        }

        System.out.println(sb);
    }
}