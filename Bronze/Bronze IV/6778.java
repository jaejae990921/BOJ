import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int antenna = Integer.parseInt(br.readLine());
        int eye = Integer.parseInt(br.readLine());

        if (antenna >= 3 && eye <= 4) {
            sb.append("TroyMartian").append("\n");
        }

        if (antenna <= 6 && eye >= 2) {
            sb.append("VladSaturnian").append("\n");
        }

        if (antenna <= 2 && eye <= 3) {
            sb.append("GraemeMercurian").append("\n");
        }

        System.out.println(sb);
    }
}