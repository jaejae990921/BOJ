import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();
        int slime = 0, score = 0;

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr, Collections.reverseOrder());

        slime = arr.get(0) + arr.get(1);
        score = arr.get(0) * arr.get(1);

        for (int j = 2; j < N; j++) {
            score += arr.get(j) * slime;
            slime += arr.get(j);
        }

        sb.append(score);
        System.out.println(sb);
    }
}