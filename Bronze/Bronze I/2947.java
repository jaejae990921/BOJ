import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] answer = { 1, 2, 3, 4, 5 };
        int[] arr = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while (!Arrays.equals(arr, answer)) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    for (int j = 0; j < 5; j++) {
                        sb.append(arr[j] + " ");
                    }
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}