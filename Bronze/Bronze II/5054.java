import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int[] arr;
    int T;

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      T = Integer.parseInt(br.readLine());
      arr = new int[T];

      st = new StringTokenizer(br.readLine());

      for (int j = 0; j < T; j++) {
        arr[j] = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(arr);

      sb.append((arr[T - 1] - arr[0]) * 2 + "\n");
    }

    System.out.println(sb);
  }
}