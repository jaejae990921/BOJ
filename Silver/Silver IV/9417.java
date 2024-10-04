import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        int max;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            max = Integer.MIN_VALUE;

            for (int j = 0; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    max = Math.max(max, getGCD(list.get(j), list.get(k)));
                }
            }

            sb.append(max).append("\n");
            list.clear();
        }

        System.out.println(sb);
    }

    public static int getGCD(int a, int b) {
        int n;

        while (b != 0) {
            n = a % b;
            a = b;
            b = n;
        }

        return a;
    }
}