import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        double d = Integer.parseInt(str[0]);
        double h = Integer.parseInt(str[1]);
        double w = Integer.parseInt(str[2]);

        double x = Math.sqrt((d * d) / (h * h + w * w));
        bw.write((int)(h * x) + " " + (int)(w * x));
        bw.flush();
        bw.close();
    }
}