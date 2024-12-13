import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static public class Cart {
        int h;
        int m;
        int s;
        String team;

        public Cart(int h, int m, int s, String team) {
            this.h = h;
            this.m = m;
            this.s = s;
            this.team = team;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Cart> carts = new ArrayList<>();
        int[] scores = { 10, 8, 6, 5, 4, 3, 2, 1 };
        StringTokenizer st, st2;
        String team;
        int h, m, s, red = 0, blue = 0;

        for (int i = 0; i < 8; i++) {
            st = new StringTokenizer(br.readLine());
            st2 = new StringTokenizer(st.nextToken(), ":");

            h = Integer.parseInt(st2.nextToken());
            m = Integer.parseInt(st2.nextToken());
            s = Integer.parseInt(st2.nextToken());
            team = st.nextToken();

            carts.add(new Cart(h, m, s, team));
        }

        carts.sort((c1, c2) -> {
            if (c1.h == c2.h) {
                if (c1.m == c2.m) {
                    return c1.s - c2.s;
                }
                return c1.m - c2.m;
            }
            return c1.h - c2.h;
        });

        for (int i = 0; i < 8; i++) {
            if (carts.get(i).team.equals("R")) {
                red += scores[i];
            } else {
                blue += scores[i];
            }
        }

        sb.append(red > blue ? "Red" : "Blue");
        System.out.println(sb);
    }
}