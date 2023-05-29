import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.valueOf(br.readLine()); // 갯수 입력
        ArrayList<Integer> nums = new ArrayList<Integer>(); // 사용자에게 입력 받은 ArrayList

        for (int i = 0; i < num; i++) { // 값 입력받아서 ArrayList에 추가
            nums.add(Integer.valueOf(br.readLine()));
        }

        for (int j = 0; j < num; j++) {
            bw.write(fmin(nums) + "\n"); // 최솟값 출력))
            nums.remove(nums.indexOf(fmin(nums))); // 사용자가 입력한 ArrayList에서 최솟값 삭제
        }
        bw.flush();
        bw.close();
    }

    public static int fmin(ArrayList<Integer> nums) { // 최솟값 찾기
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
        }
        return min;
    }
}