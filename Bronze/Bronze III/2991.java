import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt, delivery, dog1, dog2;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            cnt = 0;

            delivery = Integer.parseInt(st.nextToken());

            dog1 = delivery % (A + B);
            dog2 = delivery % (C + D);

            if (dog1 <= A && dog1 != 0) {
                cnt++;
            }

            if (dog2 <= C && dog2 != 0) {
                cnt++;
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}