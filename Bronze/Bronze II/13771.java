import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Double> list = new ArrayList<>();
      
    int N = Integer.parseInt(br.readLine());

    for (int i = 0; i < N; i++) {
        list.add(Double.parseDouble(br.readLine()));
    }

    Collections.sort(list);

    double answer = list.get(1);
    System.out.println(String.format("%.2f", answer));
  }
}
