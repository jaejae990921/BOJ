import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        String[] A = br.readLine().split(" ");
        String B = br.readLine();

        for (int i = 0; i < A.length; i++) {
            if (!A[i].equals(B) && A[i].startsWith(B)) {
                cnt++;
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}