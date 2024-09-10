import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        int cnt = Integer.MAX_VALUE, idx1 = 0, idx2 = 0, diff;
        String str;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            str = "";

            for (int j = 0; j < 5; j++) {
                str += br.readLine();
            }

            list.add(str);
        }

        for (int k = 0; k < N; k++) {
            for (int l = k + 1; l < N; l++) {
                if (k == l) {
                    continue;
                }

                diff = 0;

                for (int m = 0; m < 35; m++) {
                    if (list.get(k).charAt(m) != list.get(l).charAt(m)) {
                        diff++;
                    }
                }

                if (diff < cnt) {
                    cnt = diff;
                    idx1 = k;
                    idx2 = l;
                }
            }
        }

        sb.append(idx1 + 1).append(" ").append(idx2 + 1);
        System.out.println(sb);
    }
}