import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.valueOf(br.readLine());
        for (int i = 0; i < a; i++) {
            String[] b = br.readLine().split(" ");
            int n1 = Integer.valueOf(b[0]);
            int n2 = Integer.valueOf(b[1]);
            bw.write(n1 + n2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}