public class Palindrom {
    public static void main(String[] args) {
        isPalindrome(10);
    }
    
    public static boolean isPalindrome(int x)
    {


        if (x<0)
        {
            System.out.println("Negative number cannot palindrom");
            return false;
        }
     else{
       int temp=x, reverseNum =0,rem =0;
       while(temp != 0)
       {
         rem = temp % 10;
         reverseNum = reverseNum*10+rem;
         temp =temp/10;
       }
       
       if (reverseNum == x)
       {
        System.out.println("The palindrom is "+reverseNum); 
        System.out.println("true");   
         return true;
       }
       else
       {
        
        System.out.println("This number is not a palindrom");
        return false;
       }
        
     
    
        }}
}
