import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str;
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            str = br.readLine();
            if (str.contains("FBI")) {
                flag = true;
                bw.write((i + 1) + " ");
            }
        }
        
        if (!flag) {
            bw.write("HE GOT AWAY!");
        }

        bw.flush();
        bw.close();
    }
}