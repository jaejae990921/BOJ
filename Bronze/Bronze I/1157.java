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
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(26, 0));
        String str = br.readLine();
        int max = 0; // 
        for(int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);

            if(Character.isUpperCase(index)) {
                index -= 65;
            } else {
                index -= 97;
            }
            list.set(index, list.get(index) + 1);
        }

        for(int j = 0; j < list.size(); j++) {
            if(list.get(j) > max) {
                max = list.get(j);
            }
        }

        int count = Collections.frequency(list, max);
        if(count > 1) {
            bw.write("?");
        } else {
            bw.write((char)(list.indexOf(max) + 65));
        }
        bw.flush();
        bw.close();
    }
}