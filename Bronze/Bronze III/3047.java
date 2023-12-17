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

        String str = br.readLine();

        for (int j = 0; j < 3; j++) {
            if (str.charAt(j) == 'A') {
                sb.append(arr[0]);
            } else if (str.charAt(j) == 'B') {
                sb.append(arr[1]);
            } else {
                sb.append(arr[2]);
            }

            if (j != 2) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
	}
}