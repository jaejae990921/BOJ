import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String winner = "D";
        int A = 0, B = 0;

        int[] Acard = new int[10];
        int[] Bcard = new int[10];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 10; i++) {
            Acard[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < 10; j++) {
            Bcard[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < 10; k++) {
            if (Acard[k] > Bcard[k]) {
                A += 3;
                winner = "A";
            } else if (Acard[k] < Bcard[k]) {
                B += 3;
                winner = "B";
            } else {
                A++;
                B++;
            }
        }

        winner = (A > B) ? "A" : (A < B) ? "B" : winner;

        sb.append(A + " " + B + "\n");
        sb.append(winner);

        System.out.println(sb);
    }
}