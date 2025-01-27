import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] lights;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int gender, num;

        int N = Integer.parseInt(br.readLine());
        lights = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            lights[i] = Integer.parseInt(st.nextToken()) == 1 ? true : false;
        }

        int T = Integer.parseInt(br.readLine());

        for (int j = 0; j < T; j++) {
            st = new StringTokenizer(br.readLine());

            gender = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                man(num);
            } else {
                woman(num);
            }
        }

        for (int k = 1; k < lights.length; k++) {
            sb.append(lights[k] ? 1 : 0).append(" ");

            if (k % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }

    public static void man(int num) {
        for (int i = num; i < lights.length; i += num) {
            lights[i] = !lights[i];
        }
    }

    public static void woman(int num) {
        int left = num - 1;
        int right = num + 1;

        lights[num] = !lights[num];

        while (left > 0 && right < lights.length) {
            if (lights[left] == lights[right]) {
                lights[left] = !lights[left];
                lights[right] = !lights[right];
                left--;
                right++;
            } else {
                break;
            }
        }
    }
}