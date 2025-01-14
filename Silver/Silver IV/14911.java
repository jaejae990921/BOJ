import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreElements()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int sum = Integer.parseInt(br.readLine());

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == sum) {
                    map.put(list.get(i), list.get(j));
                }
            }
        }

        map.entrySet().stream().sorted((e1, e2) -> {
            if (e1.getKey() == e2.getKey()) {
                return e1.getValue().compareTo(e2.getValue());
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
        }).forEach(e -> sb.append(e.getKey() + " " + e.getValue() + "\n"));

        sb.append(map.size());
        System.out.println(sb);
    }
}