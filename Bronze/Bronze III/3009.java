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
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            x.add(Integer.parseInt(input[0]));
            y.add(Integer.parseInt(input[1]));
        }

        bw.write(xy(x) + " " + xy(y));
        bw.flush();
        bw.close();
    }

    public static String xy (ArrayList<Integer> arr) {
        String result = "";
        for (int j = 0; j < arr.size(); j++) {
            if (Collections.frequency(arr, arr.get(j)) == 1) {
                result = arr.get(j) + "";
            }
        }
        return result;
    }
}