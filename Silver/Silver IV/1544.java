import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        String input, temp;
        int cnt = 1;

        int N = Integer.parseInt(br.readLine());
        list.add(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            input = br.readLine();

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).length() == input.length()) {
                    temp = list.get(j) + list.get(j);

                    if (temp.contains(input)) {
                        break;
                    }
                }

                if (j == list.size() - 1) {
                    list.add(input);
                    cnt++;
                }
            }
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}