
/**
 * Write a description of WordLenghtsAssign1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class WordLengths {
    public void countWordLengths (FileResource resource, int[] counts) {
        for (String word : resource.words()) {
            int wordLength = word.length();
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(wordLength - 1);
            if (! Character.isAlphabetic(firstChar)) {
                wordLength--;
            }
            if (! Character.isAlphabetic(lastChar)) { 
                wordLength--;
            }
            if (wordLength > counts.length) {
                wordLength = counts.length;
            }
            counts[wordLength] = counts[wordLength] + 1;
            }
            for (int c = 0; c < counts.length; c++) {
                if (counts[c] == 0) {
                    // Don't print anything.
                    continue;
                }
                else {
                    System.out.println(counts[c] + " words with " + c + " characters.");
                }
            }
        }
        
    public void testCountWordLengths () {
        FileResource resource = new FileResource();
        int[] counts = new int[10000];
        countWordLengths(resource, counts);
        
    }
}
        
       
        
    

    
    

