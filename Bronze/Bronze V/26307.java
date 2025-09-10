import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int HH = Integer.parseInt(st.nextToken()) - 9;
        int MM = Integer.parseInt(st.nextToken());

        sb.append((HH * 60) + MM);
        System.out.println(sb);
    }
}