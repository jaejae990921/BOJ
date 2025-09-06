import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int hanyang = A + C;
        int yongdap = B + D;

        if (hanyang < yongdap) {
            sb.append("Hanyang Univ.");
        } else if (hanyang > yongdap) {
            sb.append("Yongdap");
        } else {
            sb.append("Either");
        }

        System.out.println(sb);
    }
}