import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        double[] arr = new double[4];

        st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double C = Double.parseDouble(st.nextToken());
        double D = Double.parseDouble(st.nextToken());

        arr[0] = A / C + B / D;
        arr[1] = C / D + A / B;
        arr[2] = D / B + C / A;
        arr[3] = B / A + D / C;

        double max = arr[0];
        int idx = 0;

        for (int i = 1; i < 4; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }

        sb.append(idx);
        System.out.println(sb);
    }
}