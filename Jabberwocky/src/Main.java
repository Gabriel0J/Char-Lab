import java.io.File;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] letterCounts = new int[256];
        // ^^ integer array (counts for each letter # of a, # of b, etc.)
        File f  = new File("JabberwockyPoem");
        Scanner scan = new Scanner(f);
        while (scan.hasNext()) {
            String line = scan.nextLine().toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                char letter = line.charAt(i);
                ++letterCounts[letter];
            }
        }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.println(letter + ": " + letterCounts[letter]);
        }
    }
}