import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int dwarf[] = new int[9];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			dwarf[i] = Integer.parseInt(br.readLine());
			sum += dwarf[i];
		}

		for (int j = 0; j < 8; j++) {
			for (int k = j + 1; k < 9; k++) {
				if (sum - dwarf[j] - dwarf[k] == 100) {
					dwarf[j] = 0;
					dwarf[k] = 0;
					break;
				}
			}

			if (dwarf[j] == 0) {
				break;
			}
		}

		Arrays.sort(dwarf);

		for (int l = 2; l < 9; l++) {
			bw.write(dwarf[l] + "\n");
		}

		bw.flush();
		bw.close();
	}
}