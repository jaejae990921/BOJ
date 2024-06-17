import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Boolean hasVowels = false, hasThree = false, twoSame = false;
        int VowelCnt = 0, ConCnt = 0;
        String str;
        char ch;

        while (!(str = br.readLine()).equals("end")) {
            VowelCnt = 0;
            ConCnt = 0;
            hasVowels = false;
            hasThree = false;
            twoSame = false;

            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);

                if (isVowel(ch)) {
                    hasVowels = true;
                    break;
                }
            }

            if (hasVowels) {
                for (int j = 0; j < str.length(); j++) {
                    ch = str.charAt(j);

                    if (isVowel(ch)) {
                        VowelCnt++;
                        ConCnt = 0;
                    } else {
                        ConCnt++;
                        VowelCnt = 0;
                    }

                    if (VowelCnt == 3 || ConCnt == 3) {
                        hasThree = true;
                        break;
                    }
                }
            }

            if (hasVowels && !hasThree) {
                for (int k = 0; k < str.length() - 1; k++) {
                    ch = str.charAt(k);

                    if (ch == str.charAt(k + 1) && ch != 'e' && ch != 'o') {
                        twoSame = true;
                        break;
                    }
                }
            }

            if (hasVowels && !hasThree && !twoSame) {
                sb.append("<").append(str).append("> is acceptable.\n");
            } else {
                sb.append("<").append(str).append("> is not acceptable.\n");
            }
        }

        System.out.println(sb);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}