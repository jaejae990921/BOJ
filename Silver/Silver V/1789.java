import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        long i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num =  Long.parseLong(br.readLine());

        for (i = 1; i < num; i++) {
            if (num - i > i) {
                num -= i;
            } else {
                break;
            }
        }
        System.out.println(i);
    }
}