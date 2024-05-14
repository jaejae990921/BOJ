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
        int num, temp = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        num = N * N % P;
        list.add(num);
        temp = num;

        while (true) {
            num = N * temp % P;

            if (list.contains(num)) {
                break;
            } else {
                list.add(num);
                temp = num;
            }
        }

        sb.append(list.size() - list.indexOf(num));
        System.out.println(sb);
    }
}