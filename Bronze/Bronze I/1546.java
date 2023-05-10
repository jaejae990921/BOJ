import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double max = 0; // 최댓값

        double num = Double.parseDouble(br.readLine()); // 횟수
        String[] scores = br.readLine().split(" "); // 점수 받기

        for (int i = 0; i < num; i++) { // 최댓값 찾기
            if (max < Double.parseDouble(scores[i])) {
                max = Double.parseDouble(scores[i]);
            }
        }

        for (int i = 0; i < num; i++) { // 점수 조작 함수 호출
            scores[i] = String.valueOf(edit(max, Double.parseDouble(scores[i])));
        }

        bw.write(String.valueOf(avg(scores, num))); // 평균 구하기
        bw.flush();
        bw.close();
    }

    public static double edit(double big, double score) { // 점수 조작
        double avg = score/big*100;
        return avg;
    }

    public static double avg(String[] scores, double num) {
        double sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Double.parseDouble(scores[i]);
        }
        return sum/num;
    }
}