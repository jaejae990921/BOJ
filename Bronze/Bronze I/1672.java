import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char temp, temp2;
        int tIdx, t2Idx;

        char[] agct = { 'A', 'G', 'C', 'T' };
        char[][] dna = {
                { 'A', 'C', 'A', 'G' },
                { 'C', 'G', 'T', 'A' },
                { 'A', 'T', 'C', 'G' },
                { 'G', 'A', 'G', 'T' }
        };

        int N = Integer.parseInt(br.readLine());
        char[] str = br.readLine().toCharArray();

        for (int i = N - 1; i > 0; i--) {
            temp = str[i - 1];
            temp2 = str[i];

            tIdx = indexOf(agct, temp);
            t2Idx = indexOf(agct, temp2);

            str[i - 1] = dna[tIdx][t2Idx];
        }

        sb.append(str[0]);
        System.out.println(sb);
    }

    public static int indexOf(char[] arr, char target) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
            }
        }
        return idx;
    }
}