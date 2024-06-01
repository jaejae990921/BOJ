import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nums = "", temp = "";
        int num, sum = 0;

        while ((temp = br.readLine()) != null) {
            if (temp.equals("")) {
                break;
            }

            nums += temp;
        }

        String[] numArr = nums.split(",");

        for (int i = 0; i < numArr.length; i++) {
            num = Integer.parseInt(numArr[i]);
            sum += num;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}