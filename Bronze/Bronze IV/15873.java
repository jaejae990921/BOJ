import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        
        String num = br.readLine();
        String noTen = num.replace("10", "");
        int tenCnt = (num.length() - noTen.length()) / 2;
        
        for (int i = 0; i < noTen.length(); i++) {
            sum += Character.getNumericValue(noTen.charAt(i));
        }

        sum += (10 * tenCnt);
        
        sb.append(sum);
        System.out.println(sb);
    }
}
