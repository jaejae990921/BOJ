import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> width = new ArrayList<>();
        ArrayList<Integer> height = new ArrayList<>();
        StringTokenizer st;
        int wh, cut, wMax = 0, hMax = 0;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            wh = Integer.parseInt(st.nextToken());
            cut = Integer.parseInt(st.nextToken());

            if (wh == 0) {
                width.add(cut);
            } else {
                height.add(cut);
            }
        }

        width.add(0);
        width.add(M);
        height.add(0);
        height.add(N);

        Collections.sort(width);
        Collections.sort(height);

        for (int j = 0; j < width.size() - 1; j++) {
            wMax = Math.max(wMax, width.get(j + 1) - width.get(j));
        }

        for (int k = 0; k < height.size() - 1; k++) {
            hMax = Math.max(hMax, height.get(k + 1) - height.get(k));
        }

        sb.append(wMax * hMax);
        System.out.println(sb);
    }
}