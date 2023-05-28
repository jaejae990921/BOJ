import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split("");
        float score = 0;
        switch(str[0]){
            case "A":
                score = 4.0f;
                break;
            case "B":
                score = 3.0f;
                break;
            case "C":
                score = 2.0f;
                break;
            case "D":
                score = 1.0f;
                break;
            case "F":
                score = 0.0f;
                break;
        }

        if(str.length == 2){
            if(str[1].equals("+")){
                score += 0.3f;
            }else if(str[1].equals("-")){
                score -= 0.3f;
            }
        }
        bw.write(score + "\n");
        bw.flush();
        bw.close();
    }
}