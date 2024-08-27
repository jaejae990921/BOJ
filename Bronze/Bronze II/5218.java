import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < s1.length(); i++) {
			int distance = (s2.charAt(i) - s1.charAt(i) + 26) % 26;

			answer.add(distance);
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for (int i = 0; i < numCases; i++) {
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for (Integer d : answer) {
				System.out.print(d + " ");
			}
			System.out.println();

		}
	}
}
