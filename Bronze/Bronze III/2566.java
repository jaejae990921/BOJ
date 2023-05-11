import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] nums = new int[9][9];
        int max = 0;
        int mRow = 0;
        int mCol = 0;

        for(int i = 0; i < 9; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                nums[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max == 0 && mRow == 0 && mCol == 0) {
                    max = nums[i][j];
                    mRow = i+1;
                    mCol = j+1;
                }
                else {
                    if(nums[i][j] > max) {
                        max = nums[i][j];
                        mRow = i+1;
                        mCol = j+1;
                    }
                }
            }
        }
        bw.write(max + "\n" + mRow + " " + mCol);
        bw.flush();
        bw.close();
    }
}