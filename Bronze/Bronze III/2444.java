import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                bw.write(" ");
            }

            for (int k = 0; k < i * 2 - 1; k++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        for (int l = N - 1; l >= 0; l--) {
            for (int m = 0; m < N - l; m++) {
                bw.write(" ");
            }

            for (int n = 0; n < l * 2 - 1; n++) {
                bw.write("*");
            }

            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}