import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static class Candidate {
        int idx;
        int one = 0;
        int two = 0;
        int three = 0;
        int total = 0;

        public Candidate(int idx) {
            this.idx = idx;
        }

        public void calc(int num) {
            if (num == 1) {
                this.one++;
            } else if (num == 2) {
                this.two++;
            } else {
                this.three++;
            }

            this.total += num;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        ArrayList<Candidate> list = new ArrayList<>();

        Candidate one = new Candidate(1);
        Candidate two = new Candidate(2);
        Candidate three = new Candidate(3);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            one.calc(Integer.parseInt(st.nextToken()));
            two.calc(Integer.parseInt(st.nextToken()));
            three.calc(Integer.parseInt(st.nextToken()));
        }

        list.add(one);
        list.add(two);
        list.add(three);

        list.sort((o1, o2) -> {
            if (o1.total == o2.total) {
                if (o1.three == o2.three) {
                    if (o1.two == o2.two) {
                        return o2.one - o1.one;
                    }
                    return o2.two - o1.two;
                }
                return o2.three - o1.three;
            }
            return o2.total - o1.total;
        });

        if (list.get(0).total == list.get(1).total && list.get(0).three == list.get(1).three
                && list.get(0).two == list.get(1).two) {
            sb.append(0).append(" ").append(list.get(0).total);
        } else {
            sb.append(list.get(0).idx).append(" ").append(list.get(0).total);
        }

        System.out.println(sb);
    }
}