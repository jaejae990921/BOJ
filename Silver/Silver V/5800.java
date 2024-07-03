import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int input, gap = 0, temp, N;
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());

            for (int j = 0; j < N; j++) {
                input = Integer.parseInt(st.nextToken());

                list.add(input);
            }

            Collections.sort(list, Collections.reverseOrder());

            for (int j = list.size() - 1; j > 0; j--) {
                temp = Math.abs(list.get(j) - list.get(j - 1));

                if (gap < temp) {
                    gap = temp;
                }
            }

            sb.append("Class " + i + "\n");
            sb.append("Max " + list.get(0) + ", Min " + list.get(N - 1) + ", Largest gap " + gap + "\n");

            list.clear();
            gap = 0;
        }

        System.out.println(sb);
    }
}