import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = st.countTokens();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}