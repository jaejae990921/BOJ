import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static public class apt {
        int idx;
        int height;

        public apt(int idx, int height) {
            this.idx = idx;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<apt> list = new ArrayList<>();
        StringTokenizer st;
        int left, right;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int floor = ((N - 1) % (M * 2));

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());

            left = Integer.parseInt(st.nextToken());
            right = Integer.parseInt(st.nextToken());

            list.add(new apt(i, left));
            list.add(new apt(i, right));
        }

        Collections.sort(list, (o1, o2) -> o1.height - o2.height);

        sb.append(list.get(floor).idx);
        System.out.println(sb);
    }
}