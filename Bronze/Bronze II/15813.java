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
        String[] name = br.readLine().split("");
        int sum = 0;
        char ch;
        for (int i = 0; i < num; i++) {
            ch = name[i].charAt(0);
            sum += ch - 'A' + 1;
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}