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
        String[] numS = br.readLine().split("");
        int[] numI = new int[numS.length];
        
        for (int i = 0; i < numI.length; i++) {
            numI[i] = Integer.parseInt(numS[i]);
        }
        
        Arrays.sort(numI);

        for (int i = numI.length - 1; i >= 0; i--) {
            bw.write(numI[i] + "");
        }
        bw.flush();
        bw.close();
    }
}