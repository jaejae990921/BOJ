import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int small, big, num, space;
        String str;

        while ((str = br.readLine()) != null) {
            small = 0;
            big = 0;
            num = 0;
            space = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch >= 'a' && ch <= 'z') {
                    small++;
                } else if (ch >= 'A' && ch <= 'Z') {
                    big++;
                } else if (ch >= '0' && ch <= '9') {
                    num++;
                } else if (ch == ' ') {
                    space++;
                }
            }

            sb.append(small + " " + big + " " + num + " " + space + "\n");
        }

        System.out.println(sb);
	}
}