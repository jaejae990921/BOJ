import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int len = str.length();
        int cnt = str.replace("DKSH", "").length();

        int answer = (len - cnt) / 4;

        sb.append(answer);
        System.out.println(sb);
    }
}