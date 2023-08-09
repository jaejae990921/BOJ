import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");
		int month = Integer.parseInt(str[0]);
		int day = Integer.parseInt(str[1]);

		LocalDate date = LocalDate.of(2007, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int answer = dayOfWeek.getValue();

		switch (answer) {
			case 1:
				bw.write("MON");
				break;
			case 2:
				bw.write("TUE");
				break;
			case 3:
				bw.write("WED");
				break;
			case 4:
				bw.write("THU");
				break;
			case 5:
				bw.write("FRI");
				break;
			case 6:
				bw.write("SAT");
				break;
			case 7:
				bw.write("SUN");
				break;
		}
		bw.flush();
		bw.close();
	}
}