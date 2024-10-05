import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> prime = new ArrayList<Integer>();
    static ArrayList<Integer> special = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();
        getSpecial();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < special.size(); i++) {
            if (special.get(i) > N) {
                sb.append(special.get(i));
                break;
            }
        }

        System.out.println(sb);
    }

    public static void getPrime() {
        boolean isPrime;

        for (int i = 2; i <= 103; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                prime.add(i);
            }
        }
    }

    public static void getSpecial() {
        for (int i = 0; i < prime.size() - 1; i++) {
            special.add(prime.get(i) * prime.get(i + 1));
        }
    }
}