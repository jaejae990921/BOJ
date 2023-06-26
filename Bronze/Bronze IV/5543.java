import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] ham = new int[3];
        int[] drink = new int[2];

        for (int i = 0; i < 3; i++) {
            ham[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 2; i++) {
            drink[i] = Integer.parseInt(br.readLine()) - 50;
        }
        Arrays.sort(drink);

        for (int i = 0; i < 3; i++) {
            ham[i] = ham[i] + drink[0];
        }
        Arrays.sort(ham);

        bw.write(ham[0] + "\n");
        bw.flush();
        bw.close();
    }
}