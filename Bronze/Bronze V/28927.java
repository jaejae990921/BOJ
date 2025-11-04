import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int max = 0, mel = 0;

        st = new StringTokenizer(br.readLine());

        max = Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 20
                + Integer.parseInt(st.nextToken()) * 120;

        st = new StringTokenizer(br.readLine());

        mel = Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 20
                + Integer.parseInt(st.nextToken()) * 120;

        if (max > mel) {
            sb.append("Max");
        } else if (max < mel) {
            sb.append("Mel");
        } else {
            sb.append("Draw");
        }

        System.out.println(sb);
    }
}