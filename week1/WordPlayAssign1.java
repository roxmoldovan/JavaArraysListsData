
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlayAssign1 {
    public boolean isVowel(char ch){
        String vowel = "AEIOUaeiou";
        for (int i=0; i<vowel.length(); i++){
            char charVowel = vowel.charAt(i);
            if (ch == charVowel){
                return true;
            }
        }
   return false;
 } 

 public void testIsVowel(){
        System.out.println(isVowel('F'));
}

//this second method is only partially working. replaces only the first instance of the vowel

public String replaceVowels(String phrase,char ch){
     StringBuilder phrase1=new StringBuilder(phrase);
     for(int i=0;i<phrase.length();i++){
     char currChar=phrase1.charAt(i);
     int pos=phrase.indexOf(currChar);
     if((pos!=-1)&&((currChar=='a'||currChar=='e'||currChar=='i'||currChar=='o'||currChar=='u'))){
          
          phrase1.setCharAt(pos,ch);   
          pos++;
     }   
     }
     return phrase1.toString();
}
public void testreplaceVowels()
{
  System.out.println(replaceVowels("i am a boy",'*'));
}
    
 public String emphasize(String phrase, char a){
        StringBuilder pharset = new StringBuilder(phrase);
        
        for (int i = 0; i < pharset.length(); i++) {
        char currChar = pharset.charAt(i);
        
        if (((currChar == Character.toLowerCase(a)) || (currChar == Character.toUpperCase(a) )) && (i%2 == 0))  {
            pharset.setCharAt(i, '*');
        }
         if (((currChar == Character.toLowerCase(a)) || (currChar == Character.toUpperCase(a) )) && (i%2 != 0)) {
            pharset.setCharAt(i, '+');
        }
        }
        return pharset.toString();
    }
   
    public void testEmphasize()
{
  System.out.println(emphasize("Mary Bella Abracadabra", 'a'));
} 
}

