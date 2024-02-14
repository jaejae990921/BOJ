import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        int res1 = (int) ((A * B) / C);
        int res2 = (int) ((A / B) * C);

        System.out.println(Math.max(res1, res2));
    }
}