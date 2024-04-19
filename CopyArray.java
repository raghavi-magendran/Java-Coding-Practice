public class CopyArray {
   // Write a Java program to copy an array by iterating the array.
    public static void main(String[] args) {
        int[] arr = {100,200,300,400,500,600};
        int[] barr= new int[arr.length];
       
        
        for(int i=0; i<arr.length;i++)
        {
               
               barr[arr.length-1-i] = arr[i]; // copies the array in reverse
              
        }
        System.out.print("The new array is ");
        for(int k=0; k<barr.length; k++) 
        {
           System.out.print(barr[k]+" ");
        }
    }
}
