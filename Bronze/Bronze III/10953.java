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
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str, ",");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(cal(a,b) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int cal(int a, int b) {
        return a + b;
    }
}