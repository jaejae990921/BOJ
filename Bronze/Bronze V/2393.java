import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        sb.append("  ___  ___  ___").append("\n");
        sb.append("  | |__| |__| |").append("\n");
        sb.append("  |           |").append("\n");
        sb.append("   \\_________/").append("\n");
        sb.append("    \\_______/").append("\n");
        sb.append("     |     |").append("\n");
        sb.append("     |     |").append("\n");
        sb.append("     |     |").append("\n");
        sb.append("     |     |").append("\n");
        sb.append("     |_____|").append("\n");
        sb.append("  __/       \\__").append("\n");
        sb.append(" /             \\").append("\n");
        sb.append("/_______________\\");

        System.out.println(sb);
    }
}