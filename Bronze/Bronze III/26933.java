import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String[] str;
        int have, need, price;
        int sum = 0;

        for(int i = 0; i < a; i++) {
            str = br.readLine().split(" ");
            have = Integer.parseInt(str[0]);
            need = Integer.parseInt(str[1]);
            price = Integer.parseInt(str[2]);

            if(need > have) {
                need = need - have;
                sum += need * price;
            }
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}