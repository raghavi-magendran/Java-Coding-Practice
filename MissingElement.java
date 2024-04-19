import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3,4,5,1};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println("The sorted array:" + Arrays.toString(arr));

        int a = arr[0];
        int b = arr[len -1];

        int ans = 0;
         
        for(int i=a; i<b; i++)
        {
           boolean res = false;
           for(int num:arr)
           {
             if(num==i)
             {
                res = true;
                break;
             }
               
           }
           if(!res)
           {
            System.out.println("The missing element is:" + i);
          }
        }
    }
}
