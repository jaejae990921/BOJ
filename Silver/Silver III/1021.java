import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int cnt = 0, target = 0, idx = 0;

        LinkedList<Integer> list = new LinkedList<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= N; i++) {
            list.offer(i);
        }

        int[] arr = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < M; j++) {
            arr[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++) {
            target = list.indexOf(arr[k]);

            if (list.size() % 2 == 0) {
                idx = list.size() / 2 - 1;
            } else {
                idx = list.size() / 2;
            }

            if (target <= idx) {
                for (int l = 0; l < target; l++) {
                    list.offerLast(list.pollFirst());
                    cnt++;
                }
            } else {
                for (int m = 0; m < list.size() - target; m++) {
                    list.offerFirst(list.pollLast());
                    cnt++;
                }
            }

            list.pollFirst();
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}