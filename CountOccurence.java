import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        System.out.println(arr);
        System.out.println("Enter the number to find occurence for:");
        int o = scanner.nextInt();

        for(int i=0;i<arr.size();i++)
        {
           int n = arr.get(i);
            
               if(n==o)
               {
                count++;
               } 
        }
        System.out.println("The number of occurence of "+o+" is "+count);
    }
}
