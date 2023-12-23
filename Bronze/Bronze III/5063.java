import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
          String[] nums = br.readLine().split(" ");

          int r = Integer.parseInt(nums[0]);
          int e = Integer.parseInt(nums[1]);
          int c = Integer.parseInt(nums[2]);

          if (r < e - c) {
            bw.write("advertise\n");
          } else if (r == e - c) {
            bw.write("does not matter\n");
          } else {
            bw.write("do not advertise\n");
          }
        }

        bw.flush();
        bw.close();
	}
}