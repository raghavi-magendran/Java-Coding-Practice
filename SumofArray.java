public class SumofArray 
{
    //Sum of vales in array
     public static void main(String[] args) 
    {
        double[] numbers = {1.0,2,3.0,5.6}; 
        double sum = 0;
        for(int i=0; i<numbers.length; i++)
        {
           sum = numbers[i]+ sum;
        }
        System.out.println(sum);
    
    }
}
