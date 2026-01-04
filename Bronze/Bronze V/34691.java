import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";

        HashMap<String, String> map = new HashMap<>();

        map.put("animal", "Panthera tigris");
        map.put("tree", "Pinus densiflora");
        map.put("flower", "Forsythia koreana");

        while ((input = br.readLine()) != null) {
            if (input.equals("end")) {
                break;
            }

            sb.append(map.get(input)).append("\n");
        }

        System.out.println(sb);
    }
}