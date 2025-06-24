import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Character, String> map = new HashMap<>();

        map.put('M', "MatKor");
        map.put('W', "WiCys");
        map.put('C', "CyKor");
        map.put('A', "AlKor");
        map.put('$', "$clear");

        char ch = br.readLine().charAt(0);

        sb.append(map.get(ch));
        System.out.println(sb);
    }
}