import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();

        String str = br.readLine();
        String[] arr = str.split("[^0-9]+");

        for (String s : arr) {
            if (!s.isEmpty()) {
                set.add(s);
            }
        }

        sb.append(set.size());
        System.out.print(sb);
    }
}