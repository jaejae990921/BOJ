import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String B1 = br.readLine();
        String B2 = br.readLine();

        long B1Num = Long.parseLong(B1, 2);
        long B2Num = Long.parseLong(B2, 2);

        sb.append(Long.toBinaryString(B1Num * B2Num));
        System.out.println(sb);
    }
}