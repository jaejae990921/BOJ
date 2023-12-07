import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String num = br.readLine();

            for (int j = 0; j < num.length(); j++) {
                if (!list.contains(num.charAt(j))) {
                    list.add(num.charAt(j));
                    cnt++;
                }
            }

            sb.append(cnt + "\n");
            cnt = 0;
            list.clear();
        }

        System.out.println(sb);
	}
}