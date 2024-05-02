import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        int num, cnt = 0;

        while (true) {
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());

            if (num == -1) {
                break;
            } else {
                list.add(num);

                while (true) {
                    num = Integer.parseInt(st.nextToken());

                    if (num == 0) {
                        break;
                    } else {
                        list.add(num);
                    }
                }
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j) * 2) {
                        cnt++;
                    }
                }
            }

            sb.append(cnt + "\n");
            cnt = 0;
            list.clear();
        }

        System.out.println(sb);
    }
}