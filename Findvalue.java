import java.util.Arrays;
import java.util.Scanner;

public class Findvalue {
    public static void main(String[] args) {
        int [] bell ={3,7,8,5,200};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to find from the array:");
        int a = scanner.nextInt();
        
        for(int i=0; i<bell.length; i++)
        {
             if(a==bell[i])
             {
                System.out.println("The value "+ a +" is found in the array");
             }
             else
             {
                System.out.println("The value is not found in the array");
             }
        }
        

    }
}
