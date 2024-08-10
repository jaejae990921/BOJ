import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> girls;
        ArrayList<Integer> nums;
        StringTokenizer st;
        int n, num, idx = 1;
        String ab;

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            girls = new ArrayList<>();
            nums = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                girls.add(br.readLine());
            }

            for (int j = 0; j < n * 2 - 1; j++) {
                st = new StringTokenizer(br.readLine());

                num = Integer.parseInt(st.nextToken());
                ab = st.nextToken();

                if (nums.contains(num)) {
                    nums.remove(nums.indexOf(num));
                } else {
                    nums.add(num);
                }
            }

            for (int k = 0; k < nums.size(); k++) {
                sb.append(idx + " " + girls.get(nums.get(k) - 1) + "\n");
            }

            idx++;
        }

        System.out.println(sb);
    }
}