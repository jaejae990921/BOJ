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
        bw.write(cal(Integer.parseInt(str[0]), Integer.parseInt(str[1])) + "");
        bw.flush();
        bw.close();
    }

    public static int cal(int R1, int S) {
        int result = (S*2) - R1;
        return result;
    }
}