import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][][] arr = new int[4][4][4];
        StringTokenizer st;
        String sub, fru, col;
        int subIdx, fruIdx, colIdx;

        String[] subject = { "kor", "eng", "math" };
        String[] fruit = { "apple", "pear", "orange" };
        String[] color = { "red", "blue", "green" };

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            sub = st.nextToken();
            fru = st.nextToken();
            col = st.nextToken();

            subIdx = 0;
            fruIdx = 0;
            colIdx = 0;

            for (int j = 0; j < 3; j++) {
                if (subject[j].equals(sub)) {
                    subIdx = j;
                }
                if (fruit[j].equals(fru)) {
                    fruIdx = j;
                }
                if (color[j].equals(col)) {
                    colIdx = j;
                }
            }

            arr[subIdx][fruIdx][colIdx]++;
            arr[subIdx][fruIdx][3]++;
            arr[subIdx][3][colIdx]++;
            arr[3][fruIdx][colIdx]++;
            arr[subIdx][3][3]++;
            arr[3][fruIdx][3]++;
            arr[3][3][colIdx]++;
            arr[3][3][3]++;
        }

        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());

            sub = st.nextToken();
            fru = st.nextToken();
            col = st.nextToken();

            subIdx = 3;
            fruIdx = 3;
            colIdx = 3;

            for (int j = 0; j < 3; j++) {
                if (subject[j].equals(sub)) {
                    subIdx = j;
                }
                if (fruit[j].equals(fru)) {
                    fruIdx = j;
                }
                if (color[j].equals(col)) {
                    colIdx = j;
                }
            }

            sb.append(arr[subIdx][fruIdx][colIdx]).append("\n");
        }

        System.out.println(sb);
    }
}