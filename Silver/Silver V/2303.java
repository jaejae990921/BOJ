import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp, maxIndex = 1, max = 0;
        int[] arr = new int[5];
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 5; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            temp = findBig(arr);

            map.put(i, temp);
        }

        for (int i = 1; i <= N; i++) {
            if (map.get(i) >= max) {
                max = map.get(i);
                maxIndex = i;
            }
        }

        sb.append(maxIndex);
        System.out.println(sb);
    }

    public static int findBig(int[] arr) {
        int max = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                for (int k = j + 1; k < 5; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    int num = sum % 10;
                    max = Math.max(max, num);
                }
            }
        }

        return max;
    }
}