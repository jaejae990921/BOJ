    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            char[][] chess = new char[8][8];
            int cnt = 0;
            String[] str;
            
            for (int a = 0; a < 8; a++) {
                str = br.readLine().split("");
                for (int b = 0; b < 8; b++) {
                    chess[a][b] = str[b].charAt(0);
                }
            }

            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < 8; j+=2) {
                        if (chess[i][j] == 'F') {
                            cnt++;
                        }
                    }
                }
                else {
                    for (int k = 1; k < 8; k+=2) {
                        if (chess[i][k] == 'F') {
                            cnt++;
                        }
                    }
                }
            }

            bw.write(cnt + "");
            bw.flush();
            bw.close();
        }
    }