import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String ticket;
        int row, col;

        String[][] movie = new String[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                movie[i][j] = ".";
            }
        }

        int N = Integer.parseInt(br.readLine());

        for (int k = 0; k < N; k++) {
            ticket = br.readLine();

            row = ticket.charAt(0) - 'A';
            col = Integer.parseInt(ticket.substring(1)) - 1;

            movie[row][col] = "o";
        }

        for (int l = 0; l < 10; l++) {
            for (int m = 0; m < 20; m++) {
                sb.append(movie[l][m]);
                if (m == 19) {
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}