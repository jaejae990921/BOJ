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
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int h, w, n;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine()," ");
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            bw.write(roomNumber(h, w, n));
        }
        bw.flush();
        bw.close();
    }

    public static String roomNumber (int h, int w, int n) {
        int floor = n % h;
        if (floor == 0) {
            floor = h;
        }
        int room = n / h;
        if (n % h != 0) {
            room++;
        }
        String result = floor + "";
        if (room < 10) {
            result += "0";
        }
        result += room;
        return result + "\n";
    }
}