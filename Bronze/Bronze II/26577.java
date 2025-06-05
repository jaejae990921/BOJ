import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        String[] input;
        String op = "";
        int a = 0, b = 0, result = 0, answer = 0;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            input = br.readLine().split(" ");
            list = new ArrayList<>(Arrays.asList(input));

            for (int j = 1; j < list.size(); j += 2) {
                op = list.get(j);

                if (op.equals("*") || op.equals("/") || op.equals("%")) {
                    a = Integer.parseInt(list.get(j - 1));
                    b = Integer.parseInt(list.get(j + 1));

                    if (op.equals("*")) {
                        result = a * b;
                    } else if (op.equals("/")) {
                        result = a / b;
                    } else if (op.equals("%")) {
                        result = a % b;
                    }

                    list.set(j - 1, String.valueOf(result));
                    list.remove(j);
                    list.remove(j);
                    j -= 2;
                }
            }

            answer = Integer.parseInt(list.get(0));

            for (int j = 1; j < list.size(); j += 2) {
                op = list.get(j);
                b = Integer.parseInt(list.get(j + 1));

                if (op.equals("+")) {
                    answer += b;
                } else if (op.equals("-")) {
                    answer -= b;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}