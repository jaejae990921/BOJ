import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<Integer>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int cnt = 1;
        int max = stack.pop();

        while (!stack.isEmpty()) {
            int num = stack.pop();

            if (num > max) {
                max = num;
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}