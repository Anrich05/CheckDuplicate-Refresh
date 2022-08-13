package checkduplicate;

import java.util.Scanner;


/**
 *
 * @author Anrich
 */
public class CheckDuplicate {
    
    static final int numofchars = 256; // max num of ASCII
    static char count[] = new char[numofchars]; //count number of occurence of character
    
    //Calculates the count of characters in the passed string
    static void getCountofChar(String str){
        
        for (int i = 0; i < str.length(); i++) {
            
            count[str.charAt(i)]++;
            
        }
        
    }
    
    /*This function returns the index of the first character that is not
    being repeated in he string. If there is none, the function returns -1 */
    static int firstnonrepeatchar(String str){
        
        getCountofChar(str);
        int index = -1,i;
        
        for ( i = 0; i < str.length(); i++) {
            
            if (count[str.charAt(i)] == 1) {
                
                index = i;
                break;
                
            }
            
        }
        
        return index;
        
    }
   
    public static void main(String[] args) {
        
        System.out.println("Please write a string value to check which character is the first one that is not repeating");
        
        Scanner input = new Scanner(System.in);
       
        String str = input.nextLine();
        str = str.toLowerCase();
        
        int index = firstnonrepeatchar(str);
        
        System.out.println( index == -1
                                          ? "Either all characters are repeating or string "
                                                   + "is empty"
                                          : "First chatacter that is not repeating is "
                                                    + str.charAt(index)
                                        );
        
    }
    
}
    

