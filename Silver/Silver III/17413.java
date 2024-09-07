import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "", temp;
        int idx = 0;

        String str = br.readLine();

        while (true) {
            if (idx >= str.length()) {
                break;
            }

            if (str.charAt(idx) == '<') {
                while (str.charAt(idx) != '>') {
                    answer += str.charAt(idx);
                    idx++;
                }
                answer += str.charAt(idx);
                idx++;
            } else {
                temp = "";
                while (idx < str.length() && str.charAt(idx) != '<') {
                    temp += str.charAt(idx);
                    idx++;
                }

                String[] arr = temp.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    answer += reverse(arr[i]) + " ";
                }
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}