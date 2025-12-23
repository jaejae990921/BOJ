import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "12", "14", "15", "16", "18", "20", "21", "24", "25",
                "27", "28", "30", "32", "35", "36", "40", "42", "45", "48", "49",
                "54", "56", "63", "64", "72", "81"));

        String N = br.readLine();

        if (list.contains(N)) {
            sb.append(1);
        } else {
            sb.append(0);
        }

        System.out.println(sb);
    }
}