import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean isValid;
        String temp;

        int[][] sudoku = new int[9][9];

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            for (int j = 0; j < 9; j++) {
                st = new StringTokenizer(br.readLine());

                for (int k = 0; k < 9; k++) {
                    sudoku[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            isValid = true;

            for (int l = 0; l < 9; l++) {
                if (!checkVertical(sudoku, l) || !checkHorizontal(sudoku, l)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (int m = 0; m < 9; m += 3) {
                    for (int n = 0; n < 9; n += 3) {
                        if (!checkSquare(sudoku, m, n)) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }

            if (isValid) {
                sb.append("Case ").append(i).append(": ").append("CORRECT\n");
            } else {
                sb.append("Case ").append(i).append(": ").append("INCORRECT\n");
            }

            if (i != T) {
                temp = br.readLine();
            }
        }

        System.out.println(sb);
    }

    public static boolean checkVertical(int[][] sudoku, int col) {
        boolean[] check = new boolean[10];

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] != 0) {
                if (check[sudoku[i][col]]) {
                    return false;
                }
                check[sudoku[i][col]] = true;
            }
        }
        return true;
    }

    public static boolean checkHorizontal(int[][] sudoku, int row) {
        boolean[] check = new boolean[10];

        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] != 0) {
                if (check[sudoku[row][i]]) {
                    return false;
                }
                check[sudoku[row][i]] = true;
            }
        }
        return true;
    }

    public static boolean checkSquare(int[][] sudoku, int row, int col) {
        boolean[] check = new boolean[10];

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (sudoku[i][j] != 0) {
                    if (check[sudoku[i][j]]) {
                        return false;
                    }
                    check[sudoku[i][j]] = true;
                }
            }
        }
        return true;
    }
}