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
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(br.readLine());
			list.add(num);
			sum += num;
		}

		Collections.sort(list);

		bw.write(sum / 5 + "\n");
		bw.write(list.get(2) + "");
		bw.flush();
		bw.close();
	}
}