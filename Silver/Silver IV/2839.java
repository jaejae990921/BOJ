import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int fcnt = 0;
        int tcnt = 0;

        int bag = Integer.parseInt(br.readLine());
    
        if (bag >= 5) {
            fcnt = fcnt + (bag / 5);
            bag = bag % 5;
        }
        if (bag >= 3) {
            tcnt = tcnt + (bag / 3);
            bag = bag % 3;
        }
        if (bag == 0) {
            bw.write(String.valueOf(fcnt + tcnt));
        } else {
            while (fcnt >= 1) {
                fcnt = fcnt - 1;
                bag = bag + 5;
                tcnt = tcnt + (bag / 3);
                bag = bag % 3;
                if (bag == 0) {
                    bw.write(String.valueOf(fcnt + tcnt));
                    break;
                }
            }
            if (bag != 0) {
                bw.write(String.valueOf(-1));
            }
        }
        
        bw.flush();
        bw.close();
    }
}