public class ArrayfromPerm {
          public static void main(String[] args) 
          {
            int[] nums ={5,4,3,2,1,0};  
            buildArray(nums);
          }
                public static int[] buildArray(int[] nums)
                {
                int[] ans = new int[nums.length];
                for(int i=0; i<nums.length; i++)
                { 
                    int n = nums[i];
                    for(int j=0; j<ans.length;j++)
                    {
                    ans[j]= nums[n];
                    }
                }
                for(int k=0; k<ans.length;k++)
                {
                    System.out.println(ans[k]);
                }
                return ans;
            }
        }
    
    

