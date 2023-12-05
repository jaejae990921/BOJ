import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();

        String str = br.readLine();

        for (int i = 1; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String add = "";
                add += reverse(str, 0, i);
                add += reverse(str, i, j);
                add += reverse(str, j, str.length());
                arr.add(add);
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(0));
	}

    public static String reverse(String str, int s, int e) {
        StringBuilder sb = new StringBuilder();
        for (int i = e - 1; i >= s; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}