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
        String deciaml = "";
        
        for (int i = 0; i < num; i++) {
            deciaml = Integer.toBinaryString(Integer.parseInt(br.readLine()));
            bw.write(findzero(reverse(deciaml)) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static String findzero(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                result += i + " ";
            }
        }
        return result;
    }
}