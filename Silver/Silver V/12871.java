import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        String t = br.readLine();
        String ss = "";
        String ts = "";

        for (int i = 0; i < t.length(); i++) {
            ss += s;
        }

        for (int j = 0; j < s.length(); j++) {
            ts += t;
        }

        sb.append(ss.contains(ts) ? "1" : "0");
        System.out.print(sb);
    }
}