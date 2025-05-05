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
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0, min = Integer.MAX_VALUE;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        int size = list.size();

        for (int i = 0; i < n; i++) {
            sum = 0;
            sum += list.get(i) + list.get(size - 1 - i);

            if (sum < min) {
                min = sum;
            }
        }

        sb.append(min);
        System.out.print(sb);
    }
}