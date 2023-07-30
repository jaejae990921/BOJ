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
        String[] nums = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            list.add(Integer.parseInt(nums[i]));
        }

        Collections.sort(list);

        bw.write(list.get(1) + "\n");
        bw.flush();
        bw.close();
    }
}