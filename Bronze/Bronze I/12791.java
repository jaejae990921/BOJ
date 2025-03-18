import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int S, E, cnt = 0;

        int[] year = { 1967, 1969, 1970, 1971, 1972, 1973, 1973, 1974, 1975, 1976, 1977, 1977, 1979, 1980, 1983, 1984,
                1987, 1993, 1995, 1997, 1999, 2002, 2003, 2013, 2016 };
        String[] name = { "DavidBowie", "SpaceOddity", "TheManWhoSoldTheWorld", "HunkyDory",
                "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars", "AladdinSane", "PinUps", "DiamondDogs",
                "YoungAmericans", "StationToStation", "Low", "Heroes", "Lodger", "ScaryMonstersAndSuperCreeps",
                "LetsDance", "Tonight", "NeverLetMeDown", "BlackTieWhiteNoise", "1.Outside", "Earthling", "Hours",
                "Heathen", "Reality", "TheNextDay", "BlackStar" };

        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());

            S = Integer.parseInt(st.nextToken());
            E = Integer.parseInt(st.nextToken());

            cnt = 0;

            for (int j = 0; j < 25; j++) {
                if (year[j] >= S && year[j] <= E) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n");

            for (int k = 0; k < 25; k++) {
                if (year[k] >= S && year[k] <= E) {
                    sb.append(year[k]).append(" ").append(name[k]).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}