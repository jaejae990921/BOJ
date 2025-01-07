import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        list.add(cntCh(str, 'u'));
        list.add(cntCh(str, 'o'));
        list.add(cntCh(str, 's'));
        list.add(cntCh(str, 'p'));
        list.add(cntCh(str, 'c'));

        Collections.sort(list);

        sb.append(list.get(0));
		System.out.println(sb);
	}

    public static int cntCh(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}
