import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] island;
        boolean isIsland = false;
        int idx = 0, cnt = 0, max = 0;

        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());

            idx = Integer.parseInt(st.nextToken());
            island = new int[12];
            cnt = 0;

            for (int j = 0; j < 12; j++) {
                island[j] = Integer.parseInt(st.nextToken());
            }

            for (int k = 0; k < 12; k++) {
                for (int l = k + 2; l < 12; l++) {
                    max = Math.max(island[k], island[l]);
                    isIsland = true;

                    for (int m = k + 1; m < l; m++) {
                        if (island[m] <= max) {
                            isIsland = false;
                            break;
                        }
                    }

                    if (isIsland) {
                        cnt++;
                    }
                }
            }

            sb.append(idx).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}