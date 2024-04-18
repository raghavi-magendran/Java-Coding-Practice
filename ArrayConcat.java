public class ArrayConcat {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<nums.length; i++)
       {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
       }
       
       for(int j=0;j<ans.length;j++)
       {System.out.println(ans[j]);}    
       
    } 
 }


