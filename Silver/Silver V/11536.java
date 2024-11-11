import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        String[] temp = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
            temp[i] = arr[i];
        }

        Arrays.sort(temp);

        if (Arrays.equals(arr, temp)) {
            sb.append("INCREASING");
        } else {
            Arrays.sort(temp, (a, b) -> b.compareTo(a));

            if (Arrays.equals(arr, temp)) {
                sb.append("DECREASING");
            } else {
                sb.append("NEITHER");
            }
        }

        System.out.println(sb);
    }
}