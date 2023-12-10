import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] arr = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        int[] arr3 = new int[N + M];
        int idx = 0;

        for (int i = 0; i < N; i++) {
            arr3[idx++] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < M; i++) {
            arr3[idx++] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(arr3);

        for (int i = 0; i < N + M; i++) {
            sb.append(arr3[i]).append(" ");
        }

        System.out.println(sb);
	}
}