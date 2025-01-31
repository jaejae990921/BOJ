import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class Player {
        int number;
        int multiScore;
        int plusScore;

        public Player(int number, int multiScore, int plusScore) {
            this.number = number;
            this.multiScore = multiScore;
            this.plusScore = plusScore;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Player> players = new ArrayList<>();
        int number, lead, speed, bould, multiScore, plusScore;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            number = Integer.parseInt(st.nextToken());
            lead = Integer.parseInt(st.nextToken());
            speed = Integer.parseInt(st.nextToken());
            bould = Integer.parseInt(st.nextToken());

            multiScore = lead * speed * bould;
            plusScore = lead + speed + bould;

            players.add(new Player(number, multiScore, plusScore));
        }

        players.sort((p1, p2) -> {
            if (p1.multiScore == p2.multiScore) {
                if (p1.plusScore == p2.plusScore) {
                    return p1.number - p2.number;
                }
                return p1.plusScore - p2.plusScore;
            }
            return p1.multiScore - p2.multiScore;
        });

        for (int j = 0; j < 3; j++) {
            sb.append(players.get(j).number).append(" ");
        }

        System.out.println(sb);
    }
}