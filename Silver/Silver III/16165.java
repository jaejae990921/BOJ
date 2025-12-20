import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, List<String>> map = new HashMap<>();
        List<String> list;
        String teamName = "", input = "";
        int memberCnt = 0, type = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            teamName = br.readLine();
            memberCnt = Integer.parseInt(br.readLine());
            list = new ArrayList<>();
                
            for (int j = 0; j < memberCnt; j++) {
                list.add(br.readLine());
            }

            map.put(teamName, list);
        }

        for (int k = 0; k < M; k++) {
            input = br.readLine();
            type = Integer.parseInt(br.readLine());

            if (type == 1) {
                for (String group : map.keySet()) {
                    if (map.get(group).contains(input)) {
                        sb.append(group).append("\n");
                        break;
                    }
                }
            } else {
                list = map.get(input);
                Collections.sort(list);
                
                for (String memberName : list) {
                    sb.append(memberName).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
