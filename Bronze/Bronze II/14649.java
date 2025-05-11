import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] nums = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String LR = "";
        int num = 0, blue = 0, red = 0, green = 0;

        int P = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            num = Integer.parseInt(st.nextToken());
            LR = st.nextToken();

            if (LR.equals("R")) {
                up(num);
            } else {
                down(num);
            }
        }

        for (int j = 1; j <= 100; j++) {
            if (nums[j] == 0) {
                blue++;
            } else if (nums[j] == 1) {
                red++;
            } else {
                green++;
            }
        }

        sb.append(String.format("%.2f", (P * (blue / 100.0)))).append("\n");
        sb.append(String.format("%.2f", (P * (red / 100.0)))).append("\n");
        sb.append(String.format("%.2f", (P * (green / 100.0))));

        System.out.print(sb);
    }

    public static void up(int num) {
        for (int i = num + 1; i <= 100; i++) {
            nums[i]++;

            if (nums[i] == 3) {
                nums[i] = 0;
            }
        }
    }

    public static void down(int num) {
        for (int i = num - 1; i >= 1; i--) {
            nums[i]++;

            if (nums[i] == 3) {
                nums[i] = 0;
            }
        }
    }
}