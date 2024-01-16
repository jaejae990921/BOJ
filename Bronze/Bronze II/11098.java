import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    int p, max, cost;
    String name;

    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
      p = Integer.parseInt(br.readLine());
      max = 0;
      HashMap<Integer, String> map = new HashMap<>();

      for (int j = 0; j < p; j++) {
        st = new StringTokenizer(br.readLine());
        cost = Integer.parseInt(st.nextToken());
        name = st.nextToken();
        map.put(cost, name);
        max = Math.max(max, cost);
      }

      sb.append(map.get(max)).append("\n");
    }

    System.out.println(sb);
  }
}