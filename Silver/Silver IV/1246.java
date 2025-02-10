import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int maxSum = 0, maxP = 0, tempSum, tempP;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] P = new int[M];

        for (int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(P);

        for (int i = 0; i < M; i++) {
            tempSum = 0;
            tempP = P[i];

            if (M - i < N) {
                tempSum = tempP * (M - i);
            } else {
                tempSum = tempP * N;
            }

            if (maxSum < tempSum) {
                maxSum = tempSum;
                maxP = tempP;
            }
        }

        sb.append(maxP).append(" ").append(maxSum);
        System.out.println(sb);
    }
}