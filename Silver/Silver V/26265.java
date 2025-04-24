import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String mentor, mentee;

        int N = Integer.parseInt(br.readLine());
        String[][] list = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            mentor = st.nextToken();
            mentee = st.nextToken();

            list[i][0] = mentor;
            list[i][1] = mentee;
        }

        Arrays.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[0].equals(o2[0])) {
                    return o2[1].compareTo(o1[1]);
                } else {
                    return o1[0].compareTo(o2[0]);
                }
            }
        });

        for (int j = 0; j < N; j++) {
            sb.append(list[j][0]).append(" ").append(list[j][1]).append("\n");
        }

        System.out.println(sb);
    }
}