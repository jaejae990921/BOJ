import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] colWidth = { 15, 15, 11, 10 };

        String[] col = { "SHIP NAME", "CLASS", "DEPLOYMENT", "IN SERVICE" };
        String[] shipName = { "N2 Bomber", "J-Type 327", "NX Cruiser", "N1 Starfighter", "Royal Cruiser" };
        String[] shipClass = { "Heavy Fighter", "Light Combat", "Medium Fighter", "Medium Fighter", "Light Combat" };
        String[] deployment = { "Limited", "Unlimited", "Limited", "Unlimited", "Limited" };
        String[] inService = { "21", "1", "18", "25", "4" };

        for (int i = 0; i < col.length; i++) {
            sb.append(String.format("%-" + colWidth[i] + "s", col[i]));
        }

        sb.append("\n");

        for (int i = 0; i < shipName.length; i++) {
            sb.append(String.format("%-" + colWidth[0] + "s", shipName[i]));
            sb.append(String.format("%-" + colWidth[1] + "s", shipClass[i]));
            sb.append(String.format("%-" + colWidth[2] + "s", deployment[i]));
            sb.append(String.format("%-" + colWidth[3] + "s", inService[i]));
            sb.append("\n");
        }

        System.out.println(sb);
    }
}