import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(".  .   .\n");
		bw.write("|  | _ | _. _ ._ _  _\n");
		bw.write("|/\\|(/.|(_.(_)[ | )(/.\n");
		bw.flush();
		bw.close();
	}
}