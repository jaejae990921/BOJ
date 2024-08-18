import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int a, b;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            sb.append(oneFesti(a) + twoFesti(b)).append('\n');
        }

        System.out.println(sb);
    }

    public static int oneFesti(int a) {
        int sum = 0;

        if (a == 1) {
            sum = 5000000;
        } else if (a >= 2 && a <= 3) {
            sum = 3000000;
        } else if (a >= 4 && a <= 6) {
            sum = 2000000;
        } else if (a >= 7 && a <= 10) {
            sum = 500000;
        } else if (a >= 11 && a <= 15) {
            sum = 300000;
        } else if (a >= 16 && a <= 21) {
            sum = 100000;
        }

        return sum;
    }

    public static int twoFesti(int a) {
        int sum = 0;

        if (a == 1) {
            sum = 5120000;
        } else if (a >= 2 && a <= 3) {
            sum = 2560000;
        } else if (a >= 4 && a <= 7) {
            sum = 1280000;
        } else if (a >= 8 && a <= 15) {
            sum = 640000;
        } else if (a >= 16 && a <= 31) {
            sum = 320000;
        }

        return sum;
    }
}