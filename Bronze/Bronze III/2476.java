import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int one, two, three, money;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            one = Integer.parseInt(st.nextToken());
            two = Integer.parseInt(st.nextToken());
            three = Integer.parseInt(st.nextToken());

            if (one == two && two == three) {
                money = 10000 + one * 1000;
            } else if (one == two || one == three) {
                money = 1000 + one * 100;
            } else if (two == three) {
                money = 1000 + two * 100;
            } else {
                money = Math.max(one, Math.max(two, three)) * 100;
            }

            arr[i] = money;
        }

        Arrays.sort(arr);

        sb.append(arr[N - 1]);
        System.out.println(sb);
    }
}