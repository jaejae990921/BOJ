import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        sb.append(avg()).append("\n");
        sb.append(median()).append("\n");
        sb.append(mode()).append("\n");
        sb.append(range());
        System.out.println(sb);
    }

    public static int avg() {
        double sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return (int) Math.round(sum / list.size());
    }

    public static int median() {
        list.sort(null);

        return list.get(list.size() / 2);
    }

    public static int mode() {
        int[] cntArr = new int[8001];
        int max = 0, cnt = 0, answer = 0;

        for (int i = 0; i < list.size(); i++) {
            cntArr[list.get(i) + 4000]++;
        }

        for (int j = 0; j < cntArr.length; j++) {
            if (cntArr[j] > max) {
                max = cntArr[j];
            }
        }

        for (int k = 0; k < cntArr.length; k++) {
            if (cntArr[k] == max) {
                cnt++;
            }
        }

        if (cnt == 1) {
            for (int l = 0; l < cntArr.length; l++) {
                if (cntArr[l] == max) {
                    answer = l - 4000;
                }
            }
        } else {
            cnt = 0;

            for (int m = 0; m < cntArr.length; m++) {
                if (cntArr[m] == max) {
                    cnt++;
                    answer = m - 4000;

                    if (cnt == 2) {
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static int range() {
        list.sort(null);

        return list.get(list.size() - 1) - list.get(0);
    }
}