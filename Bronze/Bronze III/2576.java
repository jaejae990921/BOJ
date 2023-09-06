import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		int min = 0;
		boolean flag = false;
		
		for (int i = 0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if (num % 2 == 1) {
				sum += num;
				flag = true;

				if (min == 0) {
					min = num;
				} else {
					min = Math.min(min, num);
				}
			}
		}

		if (flag) {
			bw.write(sum + "\n");
			bw.write(min + "");
		} else {
			bw.write("-1");
		}

		bw.flush();
		bw.close();
	}
}