import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        String tmp;

        map.put("000", 0);
        map.put("001", 1);
        map.put("010", 2);
        map.put("011", 3);
        map.put("100", 4);
        map.put("101", 5);
        map.put("110", 6);
        map.put("111", 7);

        String num = br.readLine();
        int len = num.length();

        if (len % 3 == 1) {
            num = "00" + num;
        } else if (len % 3 == 2) {
            num = "0" + num;
        }

        for (int i = 0; i < num.length(); i += 3) {
            tmp = num.substring(i, i + 3);
            sb.append(map.get(tmp));
        }

        System.out.println(sb);
    }
}