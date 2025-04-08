import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int R, C, T, cnt = 0;
    static int[][] picture;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        picture = new int[R][C];

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < C; j++) {
                picture[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                getMedian(i, j);
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }

    public static void getMedian(int R, int C) {
        int[] nums = new int[9];

        for (int i = R; i < R + 3; i++) {
            for (int j = C; j < C + 3; j++) {
                nums[(i - R) * 3 + (j - C)] = picture[i][j];
            }
        }

        Arrays.sort(nums);

        if (nums[4] >= T) {
            cnt++;
        }
    }
}