import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken()); // 시
        int m = Integer.parseInt(st.nextToken()); // 분
        int im = Integer.parseInt(br.readLine()); // 더할 값

        if (m + im >= 60) { // 60분이 넘을 때
            int hm = (m + im) / 60; // 얼마나 넘는지
            if(h + hm >= 24) { // 시간에 초과값을 더했을 때 24시가 넘으면
                h = (h + hm) % 24; // h = 24로 나눈 나머지
                m = (m + im) % 60; // m = 60으로 나눈 나머지
            }
            else { // 24시가 안 넘을 때
                h = h + hm; // 그냥 더하기
                m = (m + im) % 60; // m = 60으로 나눈 나머지
            }
        }
        else { // 60분이 안 넘을 때
            // h는 그대로
            m += im; // m = 그냥 더하기
        }
        bw.write(h + " " + m);
        bw.flush();
        bw.close();
    }
}