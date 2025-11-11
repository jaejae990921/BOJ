import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input;
        String temp = "";
        int mack = 0, zack = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            temp = br.readLine();
            input = temp.split(" ");

            for (int j = 0; j < 10; j++) {
                if (input[j].equals("18")) {
                    mack++;
                } else if (input[j].equals("17")) {
                    zack++;
                }
            }

            sb.append(temp).append("\n");

            if (mack > 0 && zack > 0) {
                sb.append("both").append("\n");
            } else if (mack > 0 && zack == 0) {
                sb.append("mack").append("\n");
            } else if (mack == 0 && zack > 0) {
                sb.append("zack").append("\n");
            } else {
                sb.append("none").append("\n");
            }

            mack = 0;
            zack = 0;

            sb.append("\n");
        }

        System.out.println(sb);
    }
}