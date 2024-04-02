import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int start, end, mid;

        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int N = Integer.parseInt(br.readLine());
        int[] arr2 = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < N; j++) {
            arr2[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < N; k++) {
            start = 0;
            end = M - 1;

            while (start <= end) {
                mid = (start + end) / 2;

                if (arr[mid] == arr2[k]) {
                    sb.append(1).append(" ");
                    break;
                } else if (arr[mid] < arr2[k]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            if (start > end) {
                sb.append(0).append(" ");
            }
        }

        System.out.println(sb);
    }
}