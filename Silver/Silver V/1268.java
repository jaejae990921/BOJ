import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] students = new int[N][5];

        List<Set<Integer>> same = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            same.add(new HashSet<>());
        }

        for (int j = 0; j < N; j++) {
            st = new StringTokenizer(br.readLine());

            for (int k = 0; k < 5; k++) {
                students[j][k] = Integer.parseInt(st.nextToken());
            }
        }

        for (int l = 0; l < N; l++) {
            for (int m = l + 1; m < N; m++) {
                for (int n = 0; n < 5; n++) {
                    if (students[l][n] == students[m][n]) {
                        same.get(l).add(m);
                        same.get(m).add(l);
                    }
                }
            }
        }

        int max = 0, idx = 0, size;

        for (int o = 0; o < N; o++) {
            size = same.get(o).size();

            if (size > max) {
                max = size;
                idx = o;
            }
        }

        sb.append(idx + 1);
        System.out.println(sb);
    }
}