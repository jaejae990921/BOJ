import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class Circle {
        int x, y, r;

        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Circle[] circles;
        int x, y, r, overlap;

        int N = Integer.parseInt(br.readLine());
        circles = new Circle[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            circles[i] = new Circle(x, y, r);
        }

        for (int k = 0; k < N; k++) {
            overlap = 0;

            for (int i = 0; i < N; i++) {
                if (i == k) {
                    continue;
                }

                if (Math.pow(circles[k].x - circles[i].x, 2) + Math.pow(circles[k].y - circles[i].y, 2) < Math
                        .pow(circles[k].r + circles[i].r, 2)) {
                    overlap++;
                }
            }

            sb.append(overlap).append("\n");
        }

        System.out.println(sb);
    }
}