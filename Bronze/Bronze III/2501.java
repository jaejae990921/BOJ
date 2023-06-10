import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
       
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                nums.add(i);
            }
        }
        nums.add(num);

        if (nums.size() < n) {
            bw.write("0");
        }
        else {
            bw.write(nums.get(n-1) + "");
        }
        bw.flush();
        bw.close();
    }
}