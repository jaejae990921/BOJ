    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String[] nums = br.readLine().split(" ");

            if (nums[0].equals(nums[1])) {
                bw.write(1 + "");
            }
            else {
                bw.write(0 + "");
            }

            bw.flush();
            bw.close();
        }
    }