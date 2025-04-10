import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int mode;

        int N = Integer.parseInt(br.readLine());
        char[][] mirror = new char[N][N];

        for (int i = 0; i < N; i++) {
            input = br.readLine();
            for (int j = 0; j < N; j++) {
                mirror[i][j] = input.charAt(j);
            }
        }

        mode = Integer.parseInt(br.readLine());

        switch (mode) {
            case 1:
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        sb.append(mirror[i][j]);
                    }

                    sb.append("\n");
                }
                break;
            case 2:
                for (int i = 0; i < N; i++) {
                    for (int j = N - 1; j >= 0; j--) {
                        sb.append(mirror[i][j]);
                    }

                    sb.append("\n");
                }
                break;
            case 3:
                for (int i = N - 1; i >= 0; i--) {
                    for (int j = 0; j < N; j++) {
                        sb.append(mirror[i][j]);
                    }

                    sb.append("\n");
                }
                break;

        }

        System.out.println(sb);
    }
}