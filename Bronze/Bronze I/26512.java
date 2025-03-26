import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int X, Y, mX, mY, minus;

        while (true) {
            st = new StringTokenizer(br.readLine());

            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());

            if (X + Y == 0) {
                break;
            }

            mX = X * -1;
            mY = Y * -1;
            minus = X - Y;

            sb.append(X + " = " + toBinary(X) + "\n");
            sb.append(Y + " = " + toBinary(Y) + "\n");
            sb.append(mX + " = " + toBinary(mX) + "\n");
            sb.append(mY + " = " + toBinary(mY) + "\n");
            sb.append(minus + " = " + toBinary(minus) + "\n");

            sb.append("\n");
        }

        sb.setLength(sb.length() - 2);
        System.out.println(sb);
    }

    public static String toBinary(int n) {
        return String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
    }
}