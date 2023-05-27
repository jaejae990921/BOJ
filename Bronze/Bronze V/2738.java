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
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String[][] arr = new String[a][b];
        String[][] arr2 = new String[a][b];

        inVal(arr, br);
        inVal(arr2, br);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                bw.write(Integer.parseInt(arr[i][j]) + Integer.parseInt(arr2[i][j]) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    public static void inVal(String[][] arr, BufferedReader br) throws IOException {
        for(int i = 0; i < arr.length; i++){
            String[] str = br.readLine().split(" ");
            for(int j = 0;j <arr[i].length; j++){
                arr[i][j] = str[j];
            }
        }
    }
}