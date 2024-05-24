import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        int cut = (int) (Math.round(N * 0.15));

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = cut; i < N - cut; i++) {
            sum += list.get(i);
        }

        int answer = (int) Math.round((double) sum / (N - 2 * cut));

        sb.append(answer);
        System.out.println(sb);
    }
}