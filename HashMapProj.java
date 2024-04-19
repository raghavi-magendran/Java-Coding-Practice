import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashMapProj {
    public static void main(String[] args) {
        HashSet<Integer> hnum = new HashSet<>();
        ArrayList<Integer> anum = new ArrayList<>();
        hnum.add(5);
        hnum.add(4);
        hnum.add(100);
        hnum.add(2);
        hnum.add(1);
        anum.add(200);
        anum.add(400);
        anum.add(3000);
        hnum.addAll(anum);
         int[] num1 ={2,4,6,8,1};
         int[] num2 ={1,3,4,5,6};
         ArrayList<Integer> anum1 = new ArrayList<>();
         ArrayList<Integer> anum2 = new ArrayList<>();

         HashSet<Integer> snum1 = new HashSet<Integer>();
         HashSet<Integer> snum2 = new HashSet<Integer>();

            for(int i: num1) 
                  {
                     snum1.add(i);
                  }
            for(int i: num2) 
                  {
                     snum2.add(i);
                  }     

            for(int i: snum1)
            {
                if(snum2.contains(i)==false)
                anum1.add(i);
            }
            for(int i: snum2)
            {
                if(snum1.contains(i)==false)
                anum2.add(i);
            }
        System.out.println(snum1);
        System.out.println(snum2);   
        System.out.println(anum1);
        System.out.println(anum2);
    }
    
}
