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
        int a = Integer.parseInt(br.readLine());
        String str;
        int index;
        boolean flag = true;
        int cnt = 0;

        for(int i = 0; i < a; i++) {
            str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                index = str.charAt(j) - 'a';

                if (alpha.get(index) == 0) {
                    alpha.set(index, 1);
                } else if (alpha.get(index) == 1) {
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                cnt++;
            }
            flag = true;
            alpha = new ArrayList(Collections.nCopies(26, 0));
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}