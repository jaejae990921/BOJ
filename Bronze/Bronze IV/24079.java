import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int Z = Integer.parseInt(br.readLine());

        int move = (X + Y) * 60;
        int time = Z * 60 + 30;

        if (move <= time) {
            sb.append("1");
        } else {
            sb.append("0");
        }

        System.out.println(sb);
    }
}