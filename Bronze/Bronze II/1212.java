import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String octal = br.readLine();
        String[] binary = { "000", "001", "010", "011", "100", "101", "110", "111" };
        StringBuilder sb = new StringBuilder();

        if (octal.equals("0")) {
            bw.write("0");
        }

        else {
            for (int i = 0; i < octal.length(); i++) {
                int num = octal.charAt(i) - '0';
                sb.append(binary[num]);
            }

            if (sb.charAt(0) != '0') {
                bw.write(sb.toString());
            } else {
                while (sb.charAt(0) == '0') {
                    sb = new StringBuilder(sb.substring(1));
                    if (sb.charAt(0) != '0') {
                        break;
                    }
                }
                bw.write(sb.toString());
            }
        }
        bw.flush();
        bw.close();
    }
}