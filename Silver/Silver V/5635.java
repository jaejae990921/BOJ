import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Person> people = new ArrayList<>();
        int day, month, year;
        StringTokenizer st;
        String name;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            name = st.nextToken();
            day = Integer.parseInt(st.nextToken());
            month = Integer.parseInt(st.nextToken());
            year = Integer.parseInt(st.nextToken());

            Person p = new Person(name, day, month, year);
            people.add(p);
        }

        people.sort(null);

        sb.append(people.get(people.size() - 1).name).append("\n");
        sb.append(people.get(0).name);

        System.out.println(sb);
    }

    public static class Person implements Comparable<Person> {
        private String name;
        private int day;
        private int month;
        private int year;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public int compareTo(Person o) {
            if (this.year != o.year) {
                return this.year - o.year;
            } else if (this.month != o.month) {
                return this.month - o.month;
            } else {
                return this.day - o.day;
            }
        }
    }
}