import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input;

        for (int i = 0; i < 3; i++) {
            input = br.readLine().split(" ");
            bw.write(Yutnori(input) + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static String Yutnori(String[] input) {
        String result = "";
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            if (input[i].equals("0")) {
                cnt++;
            }
        }

        if (cnt == 0) {
            result = "E";
        } else if (cnt == 1) {
            result = "A";
        } else if (cnt == 2) {
            result = "B";
        } else if (cnt == 3) {
            result = "C";
        } else if (cnt == 4) {
            result = "D";
        }

        return result;
    }
}