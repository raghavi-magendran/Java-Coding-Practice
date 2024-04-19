

public class RemoveElement {
    //Write a Java program to remove an array element.
    public static boolean contains(int[] arr, int a)
    {
        for(int n:arr)
        {
            if(a==n)
            {return true;} 
        }
        return false;
    }

    public static void main(String[] args) 
    {
     
        int[] myArray={56,23,768,34,87};
        System.out.println(contains(myArray,768));
        System.out.println(contains(myArray,24));

    }
    
}
