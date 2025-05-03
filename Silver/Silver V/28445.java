import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st;
        String fbody, ftail, mbody, mtail, t1, t2, t3;

        st = new StringTokenizer(br.readLine());
        fbody = st.nextToken();
        ftail = st.nextToken();

        st = new StringTokenizer(br.readLine());
        mbody = st.nextToken();
        mtail = st.nextToken();

        String[] colors = { fbody, ftail, mbody, mtail };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                t1 = colors[i];
                t2 = colors[j];
                t3 = t1 + " " + t2;

                if (list.contains(t3)) {
                    continue;
                } else {
                    list.add(t3);
                }
            }
        }

        Collections.sort(list, (o1, o2) -> {
            String[] arr1 = o1.split(" ");
            String[] arr2 = o2.split(" ");
            if (arr1[0].equals(arr2[0])) {
                return arr1[1].compareTo(arr2[1]);
            } else {
                return arr1[0].compareTo(arr2[0]);
            }
        });

        for (int k = 0; k < list.size(); k++) {
            sb.append(list.get(k)).append("\n");
        }

        System.out.print(sb);
    }
}