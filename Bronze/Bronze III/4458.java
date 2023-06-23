import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        String str;
        String result;

        for (int i = 0; i < num; i++) {
            str = br.readLine();
            result = (str.charAt(0) + "").toUpperCase() + str.substring(1);    
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}