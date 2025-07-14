import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String subject, grade;
        double credit, sum = 0, creditSum = 0;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            subject = st.nextToken();
            credit = Double.parseDouble(st.nextToken());
            grade = st.nextToken();

            if (!grade.equals("F")) {
                sum += credit * getGrade(grade);
            }

            creditSum += credit;
        }

        sb.append(String.format("%.2f", sum / creditSum));
        System.out.println(sb);
    }

    public static Double getGrade(String grade) {
        Double chGrade = 0.0;

        switch (grade.charAt(0)) {
            case 'A':
                chGrade = 4.0;
                break;
            case 'B':
                chGrade = 3.0;
                break;
            case 'C':
                chGrade = 2.0;
                break;
            case 'D':
                chGrade = 1.0;
                break;
        }

        switch (grade.charAt(1)) {
            case '+':
                chGrade += 0.3;
                break;
            case '-':
                chGrade -= 0.3;
                break;
        }

        return chGrade;
    }
}