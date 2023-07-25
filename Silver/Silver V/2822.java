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
        ArrayList<Integer> score = new ArrayList<Integer>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        int sum = 0;
        int num;
        int max;

        for (int i = 0; i < 8; i++) { // 숫자 입력받기
            num = Integer.parseInt(br.readLine());
            score.add(num);
        }

        for (int j = 0; j < 5; j++) {
            max = 0;
            for (int k = 0; k < 8; k++) {
                if (score.get(k) > max) {
                    max = score.get(k);
                }
            }
            sum += max;
            index.add(score.indexOf(max));
            score.set(score.indexOf(max), 0);
        }

        Collections.sort(index);

        bw.write(sum + "\n"); // 총점
        for (int l = 0; l < 5; l++) {
            bw.write((index.get(l) + 1) + " ");
        }
        bw.flush();
        bw.close();
    }
}