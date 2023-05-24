import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num, " ");
        String a = reverse(st.nextToken());
        String b = reverse(st.nextToken());

        if (Integer.valueOf(a) > Integer.valueOf(b)) {
            bw.write(a);
        } else {
            bw.write(b);
        }

        bw.flush();
        bw.close();
    }

    public static String reverse(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            temp += str.charAt(i);
        }
        return temp;
    }
}