import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] nums = br.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);
		int b = Integer.parseInt(nums[1]);
		int gcd = 1;
		
		for (int i = 2; i <= Math.min(a, b); i++) { // 최대공약수
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}

		int lcm = a * b / gcd; // 최소공배수

		bw.write(gcd + "\n" + lcm);
		bw.flush();
		bw.close();
	}
}