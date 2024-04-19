

import java.util.Arrays;public class Helloworld 
{
    public static void main(String[] args) {
      //  System.out.println("Hello World");
       // String s = "Hi HGha";



        int[] arr = {3, 4, 5, 1};
        Arrays.sort(arr);

        int a = arr[0];
        int b = arr[arr.length - 1];

        for (int i = a; i < b; i++) 
        {
            boolean found = false;
            for (int num : arr) 
            {
                if (num == i) 
                {
                    found = true;
                    break;
                }
            }
            if (!found) 
            {
                System.out.println("The missing element is: " + i);
            }
        }
    }
}

