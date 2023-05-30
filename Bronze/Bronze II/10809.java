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
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(26, -1));
        String[] str = br.readLine().split("");

        for (int i = 0; i < str.length; i++) {
            int index = str[i].charAt(0) - 'a';
            if (list.get(index) == -1) {
                list.set(index, i);
            }
        }

        for (int j = 0; j < list.size(); j++) {
            bw.write(list.get(j) + " ");
        }
        bw.flush();
        bw.close();
    }
}