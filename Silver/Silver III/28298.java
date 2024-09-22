import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char maxChar, currentChar;
        int maxFreq, index;
        int[] countList;
        String str;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            str = br.readLine();

            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int k = 0; k < K; k++) {
            for (int l = 0; l < K; l++) {
                countList = new int[26];
                maxFreq = 0;
                maxChar = 'A';

                for (int m = 0; m <= N - K; m += K) {
                    for (int n = 0; n <= M - K; n += K) {
                        currentChar = arr[m + k][n + l];
                        index = currentChar - 'A';
                        countList[index]++;

                        if (countList[index] > maxFreq) {
                            maxFreq = countList[index];
                            maxChar = currentChar;
                        }
                    }
                }

                answer += (N / K) * (M / K) - maxFreq;

                for (int m = 0; m <= N - K; m += K) {
                    for (int n = 0; n <= M - K; n += K) {
                        arr[m + k][n + l] = maxChar;
                    }
                }
            }
        }

        sb.append(answer).append("\n");

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}