import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < a; i++) {
            if (Integer.valueOf(str[i]) < b) {
                bw.write(str[i] + " ");
            }
        }
        
        bw.flush();
        bw.close();
    }
}