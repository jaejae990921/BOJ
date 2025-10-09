import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = 0, N = 0, M = 0, temp = 0;
        int[] price;
        
        N = Integer.parseInt(br.readLine());
        price = new int[N];
        
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(br.readLine());
        }
        
        M = Integer.parseInt(br.readLine());
        
        for (int j = 0; j < M; j++) {
            temp = Integer.parseInt(br.readLine());
            cnt += price[temp - 1];
        }

        sb.append(cnt);
        System.out.println(sb);
    }
}
