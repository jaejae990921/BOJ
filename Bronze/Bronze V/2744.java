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
        for (int i = 0; i < str.length(); i++) {
            int ch = (int)str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                ch -= 32;
                bw.write((char)ch);
            }
            else {
                ch += 32;
                bw.write((char)ch);
            }
        }
        bw.flush();
        bw.close();
    }
}