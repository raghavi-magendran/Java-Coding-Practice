import java.util.Scanner;
public class AverageArray {
    //Write a Java program to calculate the average value of array elements.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of you array");
        int len = 5, sum=0, avg;
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
        {
            System.out.println("Enter "+(i+1)+" number");
            arr[i]=scanner.nextInt();
            sum = sum + arr[i];
        }
        avg = sum/len;
        System.out.println("The average of the values in array "+avg);
    }
    
}
