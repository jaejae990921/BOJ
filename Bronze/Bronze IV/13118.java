import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int apple = Integer.parseInt(st.nextToken());

        for (int j = 0; j < 4; j++) {
            if (arr[j] == apple) {
                result = j + 1;
            }
        }

        System.out.println(result);
    }
}