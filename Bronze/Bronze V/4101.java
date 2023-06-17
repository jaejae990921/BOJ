import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str;
        while ((str = br.readLine().split(" ")) != null) {
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            
            if (a == 0 && b == 0) {
                break;
            }

            if (a > b) {
                bw.write("Yes");
            }
            else {
                bw.write("No");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}