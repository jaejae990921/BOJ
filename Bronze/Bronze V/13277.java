import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nums = br.readLine().split(" ");
        BigInteger a = new BigInteger(nums[0]);
        BigInteger b = new BigInteger(nums[1]);

        bw.write(a.multiply(b).toString(0));
        bw.flush();
        bw.close();
    }
}