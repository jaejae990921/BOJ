import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int[] alpah;
        boolean flag;

        while ((input = br.readLine()) != null) {
            if (input.equals("*")) {
                break;
            }

            input = input.replaceAll(" ", "");
            alpah = new int[26];
            flag = true;

            for (int i = 0; i < input.length(); i++) {
                alpah[input.charAt(i) - 'a']++;
            }

            for (int j = 0; j < alpah.length; j++) {
                if (alpah[j] == 0) {
                    flag = false;
                    break;
                }
            }

            sb.append(flag ? "Y\n" : "N\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}