import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    boolean flag = false;
    String str;

    int N = Integer.parseInt(br.readLine());
    String[] arr = new String[N];

    for (int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }

    for (int j = 0; j < N; j++) {
      str = reverse(arr[j]);

      for (int k = 0; k < N; k++) {
        if (arr[k].equals(str)) {
          sb.append(arr[k].length() + " " + arr[k].charAt(arr[k].length() / 2) + "\n");
          flag = true;
          break;
        }
      }

      if (flag) break;
    }

    System.out.println(sb);
  }

  public static String reverse(String str) {
    StringBuilder sb = new StringBuilder(str);
    return sb.reverse().toString();
  }
}