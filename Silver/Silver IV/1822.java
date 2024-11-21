import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < nA; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < nB; j++) {
            set.remove(Integer.parseInt(st.nextToken()));
        }

        if (set.size() == 0) {
            sb.append("0");
        } else {
            sb.append(set.size()).append("\n");

            List<Integer> list = new ArrayList<>(set);
            list.sort(null);

            for (int i : list) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);
    }
}