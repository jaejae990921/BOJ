import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    long cnt = 1;
      
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < 5; i++) {
        cnt *= N - i;
    }

    for (int j = 0; j < 5; j++) {
        cnt /= (j + 1);
    }
      
    sb.append(cnt);
    System.out.print(sb);
  }
}
