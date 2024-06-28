import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] coins;
    int cnt = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    coins = new int[N];

    for (int i = 0; i < N; i++) {
      coins[i] = Integer.parseInt(br.readLine());
    }

    for (int j = N - 1; j >= 0; j--) {
      cnt += K / coins[j];
      K %= coins[j];
    }

    sb.append(cnt);
    System.out.print(sb);
  }
}