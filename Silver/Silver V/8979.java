import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class Olimpic implements Comparable<Olimpic> {
        int idx;
        int gold;
        int silver;
        int bronze;
        int rank;

        public Olimpic(int idx, int gold, int silver, int bronze) {
            this.idx = idx;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
            this.rank = 1;
        }

        @Override
        public int compareTo(Olimpic o) {
            if (this.gold == o.gold) {
                if (this.silver == o.silver) {
                    return this.bronze - o.bronze;
                }
                return this.silver - o.silver;
            }
            return this.gold - o.gold;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Olimpic> list = new ArrayList<>();
        int idx, gold, silver, bronze, temp = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            idx = Integer.parseInt(st.nextToken());
            gold = Integer.parseInt(st.nextToken());
            silver = Integer.parseInt(st.nextToken());
            bronze = Integer.parseInt(st.nextToken());

            if (idx == K) {
                temp = i;
            }

            list.add(new Olimpic(idx, gold, silver, bronze));
        }

        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < list.size(); k++) {
                if (list.get(j).compareTo(list.get(k)) < 0) {
                    list.get(j).rank++;
                }
            }
        }

        sb.append(list.get(temp).rank);
        System.out.println(sb);
    }
}