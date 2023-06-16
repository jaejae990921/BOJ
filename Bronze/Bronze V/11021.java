import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String[] str;
        for (int i = 1; i <= num; i++) {
            str = br.readLine().split(" ");
            bw.write("Case #" + i + ": " + (Integer.parseInt(str[0]) + Integer.parseInt(str[1])) + "\n");
        }
        bw.flush();
        bw.close();
    }
}