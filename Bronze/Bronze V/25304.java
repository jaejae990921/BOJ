import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int price = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            int p = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            result += cal(p, num);
        }

        if (price == result) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }
        bw.flush();
        bw.close();
    }

    public static int cal(int p, int num) {
        return p * num;
    }
}