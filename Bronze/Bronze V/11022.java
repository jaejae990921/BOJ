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
        int a, b;
        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}