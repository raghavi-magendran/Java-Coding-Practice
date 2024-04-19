public class SumofElements {
    public static void main(String[] args) {
        int[] arr= new int[10];
        int sum = 0;
        arr[0]=1;
        arr[1]=5;
        arr[2]=45;
        arr[3]=32;
        arr[4]=11;
        arr[5]=15;
        arr[6]=245;
        arr[7]=302;

        for(int i=0; i<arr.length;i++)
        {
           sum = sum+arr[i];
        }
        System.out.println("The Sum of array elements is:" + sum);
    }
    
}
