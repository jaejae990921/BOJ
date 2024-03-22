import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr;
        String str = "";

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            str += "Case #" + (i + 1) + ": ";

            for (int j = arr.length - 1; j >= 0; j--) {
                str += arr[j] + " ";
            }

            str += "\n";
            sb.append(str);
            str = "";
        }

        System.out.println(sb);
    }
}