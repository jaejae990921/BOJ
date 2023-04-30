import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int i;
        int min = 0;
        int max = 0;

        String[] str = br.readLine().split(" ");

        for (i = 0; i < cnt; i++) {
            if (min == 0 && max == 0) {
                min = Integer.parseInt(str[i]);
                max = Integer.parseInt(str[i]);
            }
            
            int num = Integer.parseInt(str[i]);
            
            if (num > max) {
                max = num;
            }
            else if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}