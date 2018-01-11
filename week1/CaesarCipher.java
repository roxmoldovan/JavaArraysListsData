
/**
 * Write a description of CaesarCipherAssign2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;

public class CaesarCipher {

    public String encrypt (String input, int key) {
        StringBuilder encrypted = new StringBuilder();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (char letter : input.toCharArray()) {
            if (Character.isAlphabetic(letter)) {
                boolean isLowerCase = Character.isLowerCase(letter);
                letter = Character.toUpperCase(letter);
                int alphabetIndex = alphabet.indexOf(letter);
                letter = shiftedAlphabet.charAt(alphabetIndex);
                if (isLowerCase == true) {
                    letter = Character.toLowerCase(letter);
                }
            }
            encrypted.append(letter);
        }
        return encrypted.toString();
    }
     
    
    public void encrypt(){
     System.out.println(encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?", 15));
       
    
}


 public void testCaesar(){
     int key = 23;
        FileResource fr = new FileResource();
        String message = fr.asString();
        String encrypted = encrypt(message, key);
        System.out.println("key is " + key + "\n" + encrypted);
                     
        
    }

    public String encryptTwoKeys(String input, int key1, int key2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<input.length(); i++) {
            if (i%2 == 0){
                sb1.append(input.charAt(i));}
                else{
                sb2.append(input.charAt(i));          
                    }
        }
        
        StringBuilder encrypted1 = new StringBuilder (encrypt(sb1.toString(), key1));
        StringBuilder encrypted2 = new StringBuilder (encrypt(sb2.toString(), key2));
        StringBuilder encrypted = new StringBuilder();
        
        for (int lastSize=-1 ; encrypted.length() > lastSize; ){
            lastSize = encrypted.length();
            if(encrypted1.length() > 0){
                encrypted.append(encrypted1.charAt(0));
                encrypted1.deleteCharAt(0);               
                            }      
            if(encrypted2.length() > 0){
                encrypted.append(encrypted2.charAt(0));
                encrypted2.deleteCharAt(0);               
                 }  
             }
      
        return encrypted.toString();
        
    }
    
    public void testEncryptTwoKeys(){
        System.out.println(encryptTwoKeys("Can you imagine life WITHOUT the internet AND computers in your pocket?", 21, 8));      
        
        
    }
       
}
