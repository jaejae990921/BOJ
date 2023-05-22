import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.valueOf(st.nextToken());
        int min = Integer.valueOf(st.nextToken());

        if (min < 45) {
            if (hour == 0) {
                hour = 23;
                min = 60 - (45 - min);
            } else {
                hour -= 1;
                min = 60 - (45 - min);
            }
        } else {
            min -= 45;
        }

        bw.write(hour + " " + min);
        bw.flush();
        bw.close();
    }
}