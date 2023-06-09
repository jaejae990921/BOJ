import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            else {
                if (Py(a, b, c))
                    bw.write("right\n");
                else
                    bw.write("wrong\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static boolean Py(int a, int b, int c) {
        boolean flag = false;
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            flag = true;
        else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
            flag = true;
        else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))
            flag = true;
        else
            flag = false;
        return flag;
    }
}