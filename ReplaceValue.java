import java.util.Scanner;

public class ReplaceValue {
    //Write a Java program to insert an element (specific position) into an array.
    public static void main(String[] args) {
        int[] arr={50,80,20,60,90};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value to be replaced: ");
        int r = scanner.nextInt();
        System.out.println("Enter the index of the value to be placed");
        int i = scanner.nextInt();
        if(i >arr.length)
        {
            System.out.println("Enter the index value with the renge of the array");
        }
        else
        {
            arr[i]=r;
        }
        System.out.println("The array after the replaced value");
        for(int j=0; j<arr.length;j++)
        {
           
            System.out.print(arr[j]+" ");
        }
    }
}
