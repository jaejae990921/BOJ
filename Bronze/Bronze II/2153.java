import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        char ch;

        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                sum += ch - 'a' + 1;
            } else {
                sum += ch - 'A' + 27;
            }
        }

        if (isPrime(sum)) {
            sb.append("It is a prime word.");
        } else {
            sb.append("It is not a prime word.");
        }

        System.out.println(sb);
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}