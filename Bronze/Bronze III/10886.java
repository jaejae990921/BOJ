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
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(2, 0));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            list.set(input, list.get(input) + 1);
        }
        if (list.get(0) > list.get(1)) {
            bw.write("Junhee is not cute!");
        } else {
            bw.write("Junhee is cute!");
        }
        bw.flush();
        bw.close();
    }
}