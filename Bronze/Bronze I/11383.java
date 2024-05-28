import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        String temp = "";

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] str = new String[N];

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for (int j = 0; j < N; j++) {
            temp = "";

            for (int k = 0; k < M; k++) {
                temp += str[j].charAt(k);
                temp += str[j].charAt(k);
            }

            if (!temp.equals(br.readLine())) {
                flag = false;
                break;
            }
        }

        sb.append(flag ? "Eyfa" : "Not Eyfa");
        System.out.println(sb);
    }
}