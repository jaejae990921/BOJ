import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> asc = new ArrayList<>();
        StringTokenizer st;
        int num = 0;

        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());

            input.add(num);
            asc.add(num);
        }

        asc.sort(null);

        sb.append(input.equals(asc) ? "Good" : "Bad");
        System.out.println(sb);
    }
}