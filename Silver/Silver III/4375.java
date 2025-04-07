import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int inputNum = 0, num = 0, cnt = 0;

        while ((input = br.readLine()) != null) {
            inputNum = Integer.parseInt(input);
            num = 1;
            cnt = 1;

            while (true) {
                if (num % inputNum != 0) {
                    num = (num * 10 + 1) % inputNum;
                    cnt++;
                } else {
                    System.out.println(cnt);
                    break;
                }
            }
        }
    }
}