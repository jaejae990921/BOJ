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
        String str;
        StringTokenizer st;
        while((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }
            else {
                bw.write(rugby(name, age, weight) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    public static String rugby(String name, int age, int weight) {
        String result = "";
        if (age > 17 || weight >= 80) {
            result = name + " Senior";
        }
        else {
            result = name + " Junior";
        }
        return result;
    }
}