import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        String str;

        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 10; i++) {
            str = br.readLine();

            if (str.contains("o")) {
                x.remove(Integer.valueOf(i));

                for (int j = 0; j < 10; j++) {
                    if (str.charAt(j) == 'o') {
                        y.remove(Integer.valueOf(j + 1));
                    }
                }
            }
        }

        answer += findMin(r, x);
        answer += findMin(c, y);

        sb.append(answer);
        System.out.println(sb);
    }

    public static int findMin(int num, ArrayList<Integer> list) {
        int min = 10, temp;

        for (int i = 0; i < list.size(); i++) {
            temp = Math.abs(num - list.get(i));
            min = Math.min(min, temp);
        }

        return min;
    }
}