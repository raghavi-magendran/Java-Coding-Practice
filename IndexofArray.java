import java.util.Scanner;

public class IndexofArray {
    //Write a Java program to find the index of an array element.

   public static void main(String[] args) 
   {
    Scanner scanner = new Scanner(System.in);  
    int[] indexArr = {977,36,8764,8634,6734};
      System.out.println("Please enter the value to find index for:");
      int c = scanner.nextInt();
      for(int i=0;i<indexArr.length;i++)
      {
         if(c==indexArr[i])
         {
            System.out.println("The value is found in the array with the index of :  " + i);
            break;
         }
         else
         {
            System.out.println("The value is not found");
         }
      }
   }
    
}
