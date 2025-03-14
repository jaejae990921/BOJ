import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int max = Integer.MIN_VALUE, price, temp;

        st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] ingredients = new int[k];
        int[] recipe = new int[k];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < k; i++) {
            ingredients[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < r; j++) {
            st = new StringTokenizer(br.readLine());

            for (int l = 0; l < k; l++) {
                recipe[l] = Integer.parseInt(st.nextToken());
            }

            price = Integer.parseInt(st.nextToken());
            temp = Integer.MAX_VALUE;

            for (int m = 0; m < k; m++) {
                if (recipe[m] == 0) {
                    continue;
                }

                temp = Math.min(temp, ingredients[m] / recipe[m]);
            }

            max = Math.max(max, temp * price);
        }

        sb.append(max);
        System.out.println(sb);
    }
}