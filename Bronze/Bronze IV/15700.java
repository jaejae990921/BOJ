import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st = new StringTokenizer(br.readLine());

    long N = Long.parseLong(st.nextToken());
    long M = Long.parseLong(st.nextToken());

    sb.append((N * M / 2));
    System.out.println(sb);
  }
}