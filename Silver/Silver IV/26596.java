import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean isGold = false;
        String s;
        int x, temp;

        HashMap<String, Integer> cocktail = new HashMap<>();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            s = st.nextToken();
            x = Integer.parseInt(st.nextToken());

            if (cocktail.containsKey(s)) {
                cocktail.put(s, cocktail.get(s) + x);
            } else {
                cocktail.put(s, x);
            }
        }

        for (String c : cocktail.keySet()) {
            temp = (int) (cocktail.get(c) * 1.618);

            for (String c2 : cocktail.keySet()) {
                if (c.equals(c2)) {
                    continue;
                }

                if (temp == cocktail.get(c2)) {
                    isGold = true;
                    break;
                }
            }
        }

        if (isGold) {
            sb.append("Delicious!");
        } else {
            sb.append("Not Delicious...");
        }

        System.out.println(sb);
    }
}