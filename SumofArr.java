import java.util.Scanner;
public class SumofArr {
    public static void main(String[] args) 
    {
        int nums[]= {2,5,7,11,15};
        int target,i,j,sum;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your target:");
        target = scanner.nextInt();

        for(i=0;i<nums.length-1;i++)
        {
           for(j=nums.length-1; j > i;j--)   
          {
            sum = nums[i]+nums[j];
            
            if(target == sum)
            {
                System.out.println(sum);
                System.out.println("nums["+i+"]" + "nums[" +j+"]");
            }
            else
            {
                System.out.println("Target not found");
                break;
            }
           } 
        }
        
    }
    
}
