import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "Congratulations, you are within the speed limit!";
        int over = 0;

        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());

        if (speed > limit) {
            over = speed - limit;

            if (over <= 20) {
                answer = "You are speeding and your fine is $100.";
            } else if (over <= 30) {
                answer = "You are speeding and your fine is $270.";
            } else {
                answer = "You are speeding and your fine is $500.";
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}