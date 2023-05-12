import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String[] str = br.readLine().split(" ");
            int b = Integer.parseInt(str[0]);
            String ch = str[1];

            for (int j = 0; j < ch.length(); j++) {
                for (int k = 0; k < b; k++) {
                    bw.write(ch.charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}