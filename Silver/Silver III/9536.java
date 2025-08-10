import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> soundList = new ArrayList<>();
        String[] sounds, animals;
        String input;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sounds = br.readLine().split(" ");

            while (true) {
                input = br.readLine();

                if (input.equals("what does the fox say?")) {
                    break;
                }

                animals = input.split(" ");

                if (!soundList.contains(animals[2])) {
                    soundList.add(animals[2]);
                }
            }

            for (String sound : sounds) {
                if (!soundList.contains(sound)) {
                    sb.append(sound).append(" ");
                }
            }

            soundList.clear();
            sb.append("\n");
        }

        System.out.println(sb);
    }
}