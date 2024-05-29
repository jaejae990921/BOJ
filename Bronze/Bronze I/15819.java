import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    ArrayList<String> list = new ArrayList<>();

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int I = Integer.parseInt(st.nextToken());

    for (int i = 0; i < N; i++) {
      list.add(br.readLine());
    }

    list.sort(null);

    sb.append(list.get(I - 1));
    System.out.println(sb);
  }
}