import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    static int[] number = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num, cnt = 1;

        String str = br.readLine();
        setPlus();

        for (int i = 0; i < str.length(); i++) {
            num = str.charAt(i) - '0';

            if (number[num] > 0) {
                number[num]--;
            } else {
                if (num == 6 && number[9] > 0) {
                    number[9]--;
                } else if (num == 9 && number[6] > 0) {
                    number[6]--;
                } else {
                    setPlus();
                    cnt++;
                    number[num]--;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }

    public static void setPlus() {
        for (int i = 0; i < 10; i++) {
            number[i] += 1;
        }
    }
}