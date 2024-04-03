import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String subject, grade;
        double score, totalScore = 0.0, totalGrade = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            subject = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if (!grade.equals("P")) {
                totalScore += score;
                totalGrade += score * getScore(grade);
            }
        }

        sb.append(String.format("%.6f", totalGrade / totalScore));
        System.out.println(sb);
    }

    public static double getScore(String grade) {
        double score = 0.0;

        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
        }

        return score;
    }
}