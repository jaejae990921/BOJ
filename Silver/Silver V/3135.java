import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int min = 0, temp;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> favorite = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            favorite.add(Integer.parseInt(br.readLine()));
        }

        if (favorite.contains(B)) {
            min = 1;
        } else {
            min = Math.abs(A - B);

            for (int j = 0; j < favorite.size(); j++) {
                temp = Math.abs(favorite.get(j) - B) + 1;

                min = Math.min(min, temp);
            }
        }

        sb.append(min);
        System.out.println(sb);
    }
}