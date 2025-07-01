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
        ArrayList<Long> list = new ArrayList<>();
        boolean flag = true;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long attack = Long.parseLong(st.nextToken());

        for (int i = 0; i < N - 1; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }

        Collections.sort(list);

        for (int i = 0; i < N - 1; i++) {
            if (attack > list.get(i)) {
                attack += list.get(i);
            } else {
                flag = false;
                break;
            }
        }

        sb.append(flag ? "Yes" : "No");
        System.out.println(sb);
    }
}