import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] min = br.readLine().split(" ");
        String[] man = br.readLine().split(" ");
        int minSum = 0;
        int manSum = 0;

        for (int i = 0; i < min.length; i++) {
            minSum = minSum + Integer.parseInt(min[i]);
        }

        for (int i = 0; i < man.length; i++) {
            manSum = manSum + Integer.parseInt(man[i]);
        }

        if (minSum >= manSum) {
            bw.write(minSum + "\n");
        } else {
            bw.write(manSum + "\n");
        }

        bw.flush();
        bw.close();
    }
}