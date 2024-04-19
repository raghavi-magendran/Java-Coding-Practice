public class MaxandMin {
    //Write a Java program to find the maximum and minimum value of an array.
    public static void main(String[] args) 
    {
         int mArr[] = {88,34,5665,37,983};
         int max = 0,min =mArr[0];
         for(int i=0;i<mArr.length;i++)
         {
            if(mArr[i] > max)
            {
                max = mArr[i];
            }
            if(mArr[i]<min)
            {
                min = mArr[i];
            }
        }
        System.out.println("The maximum value in an array is:  "+ max);
        System.out.println("The minimum value in an array is:  "+ min);
    }
    
}
