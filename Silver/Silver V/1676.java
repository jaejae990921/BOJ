import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        String result = String.valueOf(factorial(N));

        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) == '0') cnt++;
            else break;
        }

        sb.append(cnt);
        System.out.println(sb);

	}

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}