import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int cnt = 0;
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                bw.write(":fan:");
                cnt++;
            } else {
                bw.write(":" + str + ":");
                cnt++;
            }
            if (cnt == 3) {
                bw.write("\n");
                cnt = 0;
            }
        }
        bw.flush();
        bw.close();
    }
}