import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    static ArrayList<Double> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double num;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < 7; i++) {
            list.add(Double.parseDouble(br.readLine()));
        }

        Collections.sort(list);

        double max = list.get(6);

        for (int j = 0; j < N - 7; j++) {
            num = Double.parseDouble(br.readLine());

            if (num <= max) {
                list.add(num);
                removeMax();
                max = findMax();
            }
        }

        Collections.sort(list);

        for (int k = 0; k < 7; k++) {
            sb.append(String.format("%.3f", list.get(k)) + "\n");
        }

        System.out.println(sb);
    }

    public static void removeMax() {
        double max = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        list.remove(list.indexOf(max));
    }

    public static double findMax() {
        double max = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;
    }
}