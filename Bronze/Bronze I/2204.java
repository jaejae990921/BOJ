import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> input = new ArrayList<String>();
        ArrayList<String> lower = new ArrayList<String>();
        String str;
        int n;

        while ((str = br.readLine()) != null) {
            n = Integer.parseInt(str);

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                input.add(br.readLine());
                lower.add(input.get(i).toLowerCase());
            }

            lower.sort(null);

            for (int i = 0; i < n; i++) {
                if (input.get(i).toLowerCase().equals(lower.get(0))) {
                    sb.append(input.get(i)).append("\n");
                    break;
                }
            }

            input.clear();
            lower.clear();
        }

        System.out.println(sb);
    }
}
