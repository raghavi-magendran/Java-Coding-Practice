public class Sample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] brr = {6,7,8,9,10};

        for(int i =0; i<arr.length;i++)
        {
            for(int j=0; j<brr.length;j++)
            {
                System.out.print(arr[i]+",");
                System.out.print(brr[j]+"  ");
            }
        }
    }
}
