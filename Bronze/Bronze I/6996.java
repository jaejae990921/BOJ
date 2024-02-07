import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String A, B;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            A = st.nextToken();
            B = st.nextToken();

            char[] a = A.toCharArray();
            char[] b = B.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            boolean isAnagram = Arrays.equals(a, b);

            sb.append(A + " & " + B + " are " + (isAnagram ? "" : "NOT ") + "anagrams.").append("\n");
        }

        System.out.println(sb);
    }
}