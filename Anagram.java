import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1,str2;
        System.out.println("To check whether the strings are anagram ");
        System.out.println("Enter first string: ");
        str1 = scanner.nextLine();
        System.out.println("Enter the second string: ");
        str2 = scanner.nextLine();   
        System.out.println(areAagram(str1, str2));  
    }
    public static boolean areAagram(String str1, String str2)
        {
            int len1,len2;
            len1 = str1.length();
            len2 = str2.length();
            if(len1 != len2)
            {
                return false;
            }
            
            char[] c1 = str1.toCharArray();
            char[] c2 = str2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            
            for(int i=0; i< c1.length; i++)
            {
                if(c1[i] == c2[i])
                {
                    System.out.println("The given strings are anagaram");
                }
            }
            return true;
        }
        
}
