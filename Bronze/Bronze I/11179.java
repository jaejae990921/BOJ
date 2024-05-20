import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String reBinary = reverse(Integer.toBinaryString(N));
        int reN = Integer.parseInt(reBinary, 2);

        sb.append(reN);
        System.out.println(sb);
    }

    public static String reverse(String s) {
        return (new StringBuffer(s)).reverse().toString();
    }
}