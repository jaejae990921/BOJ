import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> asc = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        ArrayList<Integer> desc = new ArrayList<Integer>(List.of(8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        for (int i = 0; i < 8; i++) {
            nums.add(Integer.valueOf(st.nextToken()));
        }

        if (nums.equals(asc)) {
            bw.write("ascending");
        } else if (nums.equals(desc)) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }
        bw.flush();
        bw.close();
    }
}