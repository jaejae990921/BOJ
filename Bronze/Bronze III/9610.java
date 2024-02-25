import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x, y;
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0, axis = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                axis++;
            } else if (x > 0 && y > 0) {
                q1++;
            } else if (x < 0 && y > 0) {
                q2++;
            } else if (x < 0 && y < 0) {
                q3++;
            } else {
                q4++;
            }
        }

        System.out.println("Q1: " + q1);
        System.out.println("Q2: " + q2);
        System.out.println("Q3: " + q3);
        System.out.println("Q4: " + q4);
        System.out.println("AXIS: " + axis);
    }
}