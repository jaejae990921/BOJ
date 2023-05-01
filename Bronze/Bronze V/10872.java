import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int sum = 1;
        if (num == 0) {
            bw.write("1");
        } else {
            for (int i = num; i > 0; i--) {
                sum = sum * i;
            }
            bw.write(Integer.toString(sum));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}