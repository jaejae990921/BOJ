import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<BigInteger> list = new ArrayList<>();
        StringTokenizer st;
        Matcher matcher;
        String input = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input = br.readLine();

            matcher = Pattern.compile("\\d+").matcher(input);

            while (matcher.find()) {
                list.add(toInt(matcher.group()));
            }
        }

        Collections.sort(list);

        for (BigInteger num : list) {
            sb.append(num).append("\n");
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }

        System.out.println(sb);
    }

    public static BigInteger toInt(String str) {
        try {
            return new BigInteger(str);
        } catch (NumberFormatException e) {
            return BigInteger.ZERO;
        }
    }
}