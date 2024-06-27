import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    long left = 1, right = Integer.MAX_VALUE, answer = 0, mid, count;

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[] lines = new int[N];

    for (int i = 0; i < N; i++) {
      lines[i] = Integer.parseInt(br.readLine());
    }

    while (left <= right) {
      mid = (left + right) / 2;
      count = 0;

      for (int i = 0; i < N; i++) {
        count += lines[i] / mid;
      }

      if (count >= K) {
        answer = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    sb.append(answer);
    System.out.print(sb);
  }
}