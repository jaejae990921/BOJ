import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.valueOf(br.readLine());
        String str;

        for (int i = 0; i < a; i++) {
            str = br.readLine();
            bw.write(cal(str) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static int cal (String str) {
        int sum = 0;
        int cnt = 0;

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == 'O') {
                cnt++;
                sum = sum + cnt;
            }
            else {
                cnt = 0;
            }
        }
        return sum;
    }
}