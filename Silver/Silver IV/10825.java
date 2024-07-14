import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    static class Stduent {
        String name;
        int kor;
        int eng;
        int math;

        public Stduent(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Stduent> list = new ArrayList<>();
        StringTokenizer st;
        int kor, eng, math;
        String name;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            kor = Integer.parseInt(st.nextToken());
            eng = Integer.parseInt(st.nextToken());
            math = Integer.parseInt(st.nextToken());
            list.add(new Stduent(name, kor, eng, math));
        }

        list.sort((o1, o2) -> {
            if (o1.kor == o2.kor) {
                if (o1.eng == o2.eng) {
                    if (o1.math == o2.math) {
                        return o1.name.compareTo(o2.name);
                    }
                    return o2.math - o1.math;
                }
                return o1.eng - o2.eng;
            }
            return o2.kor - o1.kor;
        });

        for (Stduent s : list) {
            sb.append(s.name).append("\n");
        }

        System.out.println(sb);
    }
}