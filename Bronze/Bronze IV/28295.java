import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String answer = "";
        int t = 0, cnt = 0;

        for (int i = 0; i < 10; i++) {
            t = Integer.parseInt(br.readLine());
            cnt += t;
        }

        cnt = cnt % 4;

        switch (cnt) {
            case 0:
                answer = "N";
                break;
            case 1:
                answer = "E";
                break;
            case 2:
                answer = "S";
                break;
            case 3:
                answer = "W";
                break;
        }

        sb.append(answer);
        System.out.println(sb);
    }
}
