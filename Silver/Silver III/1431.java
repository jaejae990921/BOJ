import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        list.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                int Asum = 0;
                int Bsum = 0;

                for (int i = 0; i < o1.length(); i++) {
                    if (o1.charAt(i) >= '0' && o1.charAt(i) <= '9') {
                        Asum += o1.charAt(i) - '0';
                    }
                    if (o2.charAt(i) >= '0' && o2.charAt(i) <= '9') {
                        Bsum += o2.charAt(i) - '0';
                    }
                }
                if (Asum != Bsum) {
                    return Asum - Bsum;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (String s : list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}