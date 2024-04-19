import java.util.ArrayList;

public class MaxNumArrayList {
    public static void main(String[] args) {
        int max=0;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(233);
        arr.add(4);

        System.out.println(arr);

        for(int i = 0; i<arr.size(); i++)
        {
            int n = arr.get(i);
            if(n>max)
            {
                 max = n;
            }
        }
        System.out.println("The maximum number in arraylist is : "+max);
    }
}
