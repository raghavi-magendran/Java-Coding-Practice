public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("The give array is sorted: "+isarrsorted(arr));
    }

    public static boolean isarrsorted(int[] arr)
    {
        int s = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > s)
            {
                 s = arr[i];
            }
            else
            {
                return false;
            }
            
        }
        return true;
    }    
}
