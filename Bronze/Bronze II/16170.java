import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        LocalDateTime now = LocalDateTime.now();
        now.minusHours(9);

        sb.append(now.getYear()).append("\n").append(now.getMonthValue()).append("\n").append(now.getDayOfMonth());
		System.out.println(sb);
	}
}
