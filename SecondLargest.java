import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 9, 1000, 1000, 100,200,500,500,700};
        int len = arr.length;
        int count=0;
        int[] darr = new int[len];
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                //System.out.println(arr[i]);
                
                if(arr[i]==arr[j])
                {
                    arr[j]=arr[len-1];
                    len--;
                    j--; 
                }
                System.out.println(arr[j]);
               // System.out.println(Arrays.toString(arr[j]));
            }
            
        }
        System.out.println("The duplicate elements : "+count);
        Arrays.sort(arr);
        System.out.println("Sorted Array:" + Arrays.toString(arr));
        System.out.println("The second larget element is :" + arr[len-2]);
    }
}  
