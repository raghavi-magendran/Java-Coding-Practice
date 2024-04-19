import java.util.Arrays;

public class ManualArraySort {
    public static void main(String[] args) {
        int[] arr= {5,3,1,2,4};
        int temp;

        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr.length-1-i;j++)
           { if(arr[j]>arr[j+1])
            {
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        }
        System.out.println(Arrays.toString(arr));
    }
}
