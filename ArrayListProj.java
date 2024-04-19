import java.util.ArrayList;
import java.util.*;

public class ArrayListProj {
    public static void main(String[] args) {
        ArrayList<String> lArray= new ArrayList<String>();
        lArray.add("moon");
        lArray.add("sea");
        lArray.add("sun");
        lArray.add("rain");
        lArray.add("wind");
        lArray.add("stars");
        System.out.println(lArray);

        String[] nArray = {"big","small","tall","short"};
        ArrayList<String> kArray= new ArrayList<String>(lArray);
        kArray.add("shore");
        System.out.println(kArray);
        
        Iterator<String> iterator = kArray.iterator();

        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
         
        }

    }
    
}
