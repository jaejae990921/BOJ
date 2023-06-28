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

        String[] color = new String[] { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        String c1 = br.readLine();
        String c2 = br.readLine();
        String c3 = br.readLine();
        String num = Arrays.asList(color).indexOf(c1) + "" + Arrays.asList(color).indexOf(c2);
        long result = Long.parseLong(num) * (long)Math.pow(10, Arrays.asList(color).indexOf(c3));
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}