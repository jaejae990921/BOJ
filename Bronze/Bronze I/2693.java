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
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String[] str;
        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i < a; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                nums.add(Integer.parseInt(str[j]));
            }
            Collections.sort(nums);
            bw.write(nums.get(7) + "\n");
            nums.clear();
        }
        bw.flush();
        bw.close();
    }
}