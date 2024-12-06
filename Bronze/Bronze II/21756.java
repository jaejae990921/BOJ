import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while (list.size() >= 2) {
            for (int j = 0; j < list.size(); j++) {
                list.remove(j);
            }
        }

        sb.append(list.get(0));
        System.out.println(sb);
    }
}