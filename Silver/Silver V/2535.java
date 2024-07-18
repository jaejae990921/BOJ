import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class player {
        int team, number, score;

        public player(int team, int number, int score) {
            this.team = team;
            this.number = number;
            this.score = score;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int team, number, score;

        int N = Integer.parseInt(br.readLine());
        player[] players = new player[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            team = Integer.parseInt(st.nextToken());
            number = Integer.parseInt(st.nextToken());
            score = Integer.parseInt(st.nextToken());

            players[i] = new player(team, number, score);
        }

        Arrays.sort(players, (p1, p2) -> p2.score - p1.score);

        sb.append(players[0].team).append(" ").append(players[0].number).append("\n");
        sb.append(players[1].team).append(" ").append(players[1].number).append("\n");

        for (int j = 2; j < N; j++) {
            if (players[j].team != players[0].team || players[j].team != players[1].team) {
                sb.append(players[j].team).append(" ").append(players[j].number).append("\n");
                break;
            }
        }

        System.out.println(sb);
    }
}