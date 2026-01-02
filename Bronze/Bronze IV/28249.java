import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = 0;
        
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Poblano", 1500);
        map.put("Mirasol", 6000);
        map.put("Serrano", 15500);
        map.put("Cayenne", 40000);
        map.put("Thai", 75000);
        map.put("Habanero", 125000);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            T += map.get(br.readLine());
        }

        sb.append(T);
        System.out.println(sb);
    }
}
