import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        String temp = "", toString = "";

        String[] numberStr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] number = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            temp = Integer.toString(i);
            toString = "";

            for (int j = 0; j < temp.length(); j++) {
                toString += numberStr[temp.charAt(j) - '0'] + " ";
            }

            toString = toString.substring(0, toString.length() - 1);
            list.add(toString);
        }

        Collections.sort(list);

        for (int k = 0; k < list.size(); k++) {
            temp = list.get(k);
            toString = "";

            st = new StringTokenizer(temp);

            while (st.hasMoreTokens()) {
                temp = st.nextToken();

                for (int l = 0; l < numberStr.length; l++) {
                    if (temp.equals(numberStr[l])) {
                        toString += number[l];
                        break;
                    }
                }
            }

            sb.append(toString + " ");

            if ((k + 1) % 10 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}