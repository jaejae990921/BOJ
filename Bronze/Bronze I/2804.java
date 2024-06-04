import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        char chA, chB;
        int Aidx = 0, Bidx = 0;
        boolean flag = false;

        String A = st.nextToken();
        String B = st.nextToken();

        for (int i = 0; i < A.length(); i++) {
            chA = A.charAt(i);

            for (int j = 0; j < B.length(); j++) {
                chB = B.charAt(j);

                if (chA == chB) {
                    Aidx = i;
                    Bidx = j;
                    flag = true;
                }

                if (flag)
                    break;
            }

            if (flag)
                break;
        }

        for (int k = 0; k < B.length(); k++) {
            for (int l = 0; l < A.length(); l++) {
                if (l == Aidx)
                    sb.append(B.charAt(k));
                else if (k == Bidx)
                    sb.append(A.charAt(l));
                else
                    sb.append(".");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}