import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        int aC = 0, bC = 0;

        String str = br.readLine();

        for (int i = 0; i < V; i++) {
            if (str.charAt(i) == 'A') {
                aC++;
            } else {
                bC++;
            }
        }

        String result = aC > bC ? "A" : (aC < bC ? "B" : "Tie");

        System.out.println(result);
    }
}