import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        //Write a Java program to sort a numeric array and a string array.

        int[] nums = {5,6,7,3,2,1};
        String[] words = {"delay","airplane","may","train"}; 
        Arrays.sort(nums);
        Arrays.sort(words);

       for(int i=0; i<nums.length; i++)
        {System.out.print(nums[i]+" , ");}
        
        for(int j=0; j<words.length; j++)
        {System.out.print(words[j]+" ");}

    }
    
}
