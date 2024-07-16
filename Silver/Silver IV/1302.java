import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String book;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            book = br.readLine();

            if (map.containsKey(book)) {
                map.put(book, map.get(book) + 1);
            } else {
                map.put(book, 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> {
            if (map.get(o1).equals(map.get(o2))) {
                return o1.compareTo(o2);
            }
            return map.get(o2) - map.get(o1);
        });

        sb.append(list.get(0));
        System.out.println(sb);
    }
}