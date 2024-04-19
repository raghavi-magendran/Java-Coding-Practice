import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        Iterator<Integer> numiterator = numbers.iterator();
        
        for(int i=0; i<numbers.size();i++)
        {
            int n = numbers.get(i);
            if(n%2==0)
            {
                System.out.println(n +" is an even number in this array");
            }
        }

    }
}
