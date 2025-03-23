import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.StringTokenizer;
 
 public class Main {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
         String answer = "answer";
         
         int a = Integer.parseInt(br.readLine());
         int b = Integer.parseInt(br.readLine());
         int c = Integer.parseInt(br.readLine());
         int d = Integer.parseInt(br.readLine());
         
         boolean aa = (a == 8 || a == 9);
         boolean bc = b == c;
         boolean dd = (d == 8 || d == 9);
         
         if (aa && bc && dd) {
             answer = "ignore";
         }

         sb.append(answer);
         System.out.println(sb);
     }
 }
