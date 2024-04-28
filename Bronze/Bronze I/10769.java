import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int happy = 0, sad = 0;

    String str = br.readLine();

    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == ':' && str.charAt(i + 1) == '-') {
        if (str.charAt(i + 2) == ')') {
          happy++;
        } else if (str.charAt(i + 2) == '(') {
          sad++;
        }
      }
    }

    sb.append(happy == 0 && sad == 0 ? "none" : happy == sad ? "unsure" : happy > sad ? "happy" : "sad");
    System.out.println(sb);
  }
}