import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        int max = 1, now, cnt;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            set.add(arr[i]);
        }

        for (Integer num : set) {
            now = num;
            cnt = 1;

            for (int j = 1; j < N; j++) {
                if (arr[j] == num) {
                    continue;
                }

                if (arr[j] != now) {
                    cnt = 1;
                } else {
                    cnt++;
                    max = Math.max(max, cnt);
                }

                now = arr[j];
            }
        }

        sb.append(max);
        System.out.println(sb);
    }
}