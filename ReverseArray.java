import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int reverse[] = new int[arr.length];
        int temp =0;

        for(int i=0;i<arr.length;i++)
        {
           for(int j=arr.length-1-i;j>=0;j--)
           {
            reverse[j] = arr[i];
           }
        }
        System.out.println(Arrays.toString(reverse));
    }
}
