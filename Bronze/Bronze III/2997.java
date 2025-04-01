import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];

        if (diff == diff2) {
            sb.append(arr[2] + diff);
        } else if (diff < diff2) {
            sb.append(arr[1] + diff);
        } else {
            sb.append(arr[0] + diff2);
        }

        System.out.println(sb);
    }
}