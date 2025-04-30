import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            
            while (st.hasMoreTokens()) {
                list.add(st.nextToken());
            }
            
            sb.append("god");
            
            for (int j = 1; j < list.size(); j++) {
                sb.append(list.get(j));
            }
            
            sb.append("\n");
            list.clear();
        }
        
        System.out.println(sb);
    }
}
