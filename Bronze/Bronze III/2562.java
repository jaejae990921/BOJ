import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = 0;
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            if (max == 0 && maxIndex == 0) {
                max = arr[i];
                maxIndex = i + 1;
                }
            else {
                if (max < arr[i]) {
                    max = arr[i];
                    maxIndex = i + 1;
                }
            }
        }

        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(maxIndex));
        bw.flush();
        bw.close();
    }
}