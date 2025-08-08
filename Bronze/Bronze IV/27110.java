import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num, sum = 0;
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 3; i++) {
            num = Integer.parseInt(st.nextToken());
        
            if (num < N) {
                sum += num;
            } else {
                sum += N;
            }
        }
        
        sb.append(sum);
        System.out.println(sb);
    }
}
