import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        String N = br.readLine();
        int[] arr = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }

        if (arr[0] != 0 || sum % 3 != 0) {
            sb.append(-1);
        } else {
            for (int k = arr.length - 1; k >= 0; k--) {
                sb.append(arr[k]);
            }
        }

        System.out.println(sb);
    }
}