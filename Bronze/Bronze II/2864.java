import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        A = A.replace("6", "5");
        B = B.replace("6", "5");

        sb.append(Integer.parseInt(A) + Integer.parseInt(B)).append(" ");

        A = A.replace("5", "6");
        B = B.replace("5", "6");

        sb.append(Integer.parseInt(A) + Integer.parseInt(B));

        System.out.println(sb);
    }
}