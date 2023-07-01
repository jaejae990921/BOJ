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
            String[] a = nums[0].split("");
            String[] b = nums[1].split("");
            long sum = 0;
            for(int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    sum += Integer.parseInt(a[i]) * Integer.parseInt(b[j]);
                }
            }
            bw.write(sum + "\n");
            bw.flush();
            bw.close();
        }
    }