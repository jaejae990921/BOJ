import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> map = new HashMap<>();
        StringTokenizer st;
        String name = "";
        int people = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < 7; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            people = Integer.parseInt(st.nextToken());
            max = Math.max(max, people);

            map.put(people, name);
        }

        sb.append(map.get(max));
        System.out.println(sb);
    }
}