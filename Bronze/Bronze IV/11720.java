import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.valueOf(br.readLine());
        String str = br.readLine();
        
        bw.write(cal(a, str) + "\n");
        bw.flush();
        bw.close();
    }

    public static int cal (int a, String str) {
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        return sum;
    }
}