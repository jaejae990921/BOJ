import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int n = d(i);

            if (n <= 10000) {
                arr[n] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.println(sb);
    }

    public static int d(int number) {
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }

        return sum;
    }
}