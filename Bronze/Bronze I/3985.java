import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int start, end;
        int max = 0, idx = 0;
        int maxCnt = 0, cnt = 0, realIdx = 0;

        int L = Integer.parseInt(br.readLine());
        int[] arr = new int[L];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            cnt = 0;

            if (end - start > max) {
                max = end - start;
                idx = i + 1;
            }

            for (int j = start - 1; j < end; j++) {
                if (arr[j] == 0) {
                    arr[j] = i + 1;
                    cnt++;
                }
            }

            if (cnt > maxCnt) {
                maxCnt = cnt;
                realIdx = i + 1;
            }
        }

        sb.append(idx).append("\n").append(realIdx);
        System.out.println(sb);
    }
}