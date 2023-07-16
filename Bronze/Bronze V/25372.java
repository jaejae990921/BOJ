import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String pw;
        for (int i = 0; i < n; i++) {
            pw = br.readLine();
            if (pw.length() >= 6 && pw.length() <= 9) {
                bw.write("yes");
            }
            else {
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}