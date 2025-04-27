import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input = "", temp = "";

        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = true;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            temp = st.nextToken() + st.nextToken();

            if (temp.equals("13") || temp.equals("31")) {
                a = true;
            } else if (temp.equals("14") || temp.equals("41")) {
                b = true;
            } else if (temp.equals("34") || temp.equals("43")) {
                c = true;
            } else {
                d = false;
            }
        }

        if (a && b && c && d) {
            sb.append("Wa-pa-pa-pa-pa-pa-pow!");
        } else {
            sb.append("Woof-meow-tweet-squeek");
        }

        System.out.println(sb);
    }
}