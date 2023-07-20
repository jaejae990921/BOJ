import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]); // 헬멧
        int b = Integer.parseInt(num[1]); // 조끼
        int[] helmet = new int[a];
        int[] jacket = new int[b];

        String[] helmetStr = br.readLine().split(" ");
        for (int i = 0; i < a; i++) {
            helmet[i] = Integer.parseInt(helmetStr[i]);
        }

        String[] jacketStr = br.readLine().split(" ");
        for (int i = 0; i < b; i++) {
            jacket[i] = Integer.parseInt(jacketStr[i]);
        }

        Arrays.sort(helmet);
        Arrays.sort(jacket);

        int sum = helmet[a-1] + jacket[b-1];

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}