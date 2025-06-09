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
        String input = "";

        while ((input = br.readLine()) != null) {
            list.add(Integer.parseInt(input));
        }

        Collections.sort(list);
        int medianIndex = list.size() / 2;

        sb.append(list.get(medianIndex));
        System.out.println(sb);
    }
}