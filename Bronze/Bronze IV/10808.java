import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> alpha = new ArrayList(Collections.nCopies(26, 0));
        String str = br.readLine();
        int index;

        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i) - 'a';
            alpha.set(index, alpha.get(index) + 1);
        }

        for (int j = 0; j < alpha.size(); j++) {
            bw.write(alpha.get(j) + " ");
        }
        bw.flush();
        bw.close();
    }
}