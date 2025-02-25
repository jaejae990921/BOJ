import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "";

        String[] num = br.readLine().split("");

        if (num.length == 1 || num.length == 2) {
            answer = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
        } else {
            int diff = Integer.parseInt(num[1]) - Integer.parseInt(num[0]);
            answer = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";

            for (int i = 1; i < num.length - 1; i++) {
                if (Integer.parseInt(num[i + 1]) - Integer.parseInt(num[i]) != diff) {
                    answer = "흥칫뿡!! <(￣ ﹌ ￣)>";
                    break;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }
}