import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int num;

        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(br.readLine());

            if (list.contains(num)) {
                list.remove(list.indexOf(num));
            } else {
                list.add(num);
            }
        }

        sb.append(list.get(0));
        System.out.println(sb);
    }
}