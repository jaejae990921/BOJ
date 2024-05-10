import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
      public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            String num = br.readLine();
            int len = num.length() / 2;

            String left = num.substring(0, len);
            String right = num.substring(len);

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < len; i++) {
                  leftSum += left.charAt(i) - '0';
                  rightSum += right.charAt(i) - '0';
            }

            if (leftSum == rightSum) {
                  sb.append("LUCKY");
            } else {
                  sb.append("READY");
            }

            System.out.println(sb);
      }
}