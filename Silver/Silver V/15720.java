import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int before = 0, after = 0;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int min = Math.min(B, Math.min(C, D));

        ArrayList<Integer> hamberger = new ArrayList<>();
        ArrayList<Integer> drink = new ArrayList<>();
        ArrayList<Integer> side = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < B; i++) {
            hamberger.add(Integer.parseInt(st.nextToken()));
            before += hamberger.get(i);
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < C; j++) {
            drink.add(Integer.parseInt(st.nextToken()));
            before += drink.get(j);
        }

        st = new StringTokenizer(br.readLine());

        for (int k = 0; k < D; k++) {
            side.add(Integer.parseInt(st.nextToken()));
            before += side.get(k);
        }

        hamberger.sort((a, b) -> b - a);
        drink.sort((a, b) -> b - a);
        side.sort((a, b) -> b - a);

        for (int l = 0; l < min; l++) {
            after += (hamberger.get(l) + drink.get(l) + side.get(l)) * 0.9;
        }

        for (int m = min; m < B; m++) {
            after += hamberger.get(m);
        }

        for (int n = min; n < C; n++) {
            after += drink.get(n);
        }

        for (int o = min; o < D; o++) {
            after += side.get(o);
        }

        sb.append(before).append("\n").append(after);
        System.out.println(sb);
    }
}