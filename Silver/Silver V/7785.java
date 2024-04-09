import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Set<String> list = new HashSet<>();
    StringTokenizer st;
    String name, status;

    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());

      name = st.nextToken();
      status = st.nextToken();

      if (status.equals("enter")) {
        list.add(name);
      } else {
        list.remove(name);
      }
    }

    ArrayList<String> Alist = new ArrayList<>(list);
    Collections.sort(Alist, Collections.reverseOrder()); //

    for (String s : Alist) {
      sb.append(s).append('\n');
    }

    System.out.println(sb);
  }
}