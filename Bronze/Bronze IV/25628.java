import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");
        int b = Integer.parseInt(num[0]); // 빵
        int p = Integer.parseInt(num[1]); // 패티
        int cnt = 0;
        
        if (b >= 2 && p >= 1) {
            while (b >= 2 && p >= 1) {
                b -= 2;
                p -= 1;
                cnt++;
            }
            bw.write(cnt + "\n");
        } else {
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}