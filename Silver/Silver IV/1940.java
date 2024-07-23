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
        ArrayList<Integer> arr = new ArrayList<>();
        int temp;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        int left = 0;
        int right = N - 1;
        int cnt = 0;

        while (left < right) {
            temp = arr.get(left) + arr.get(right);

            if (temp < M) {
                left++;
            } else if (temp > M) {
                right--;
            } else {
                left++;
                right--;
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}