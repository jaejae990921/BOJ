import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine());
        int price = 0;

        for (int i = 0; i < 9; i++) {
            price += Integer.parseInt(br.readLine());
        }

        bw.write(sum - price + "\n");
        bw.flush();
        bw.close();
    }
}