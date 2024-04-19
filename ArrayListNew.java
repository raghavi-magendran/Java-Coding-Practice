import java.util.ArrayList;

public class ArrayListNew {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("chcocolate");
        food.add("fruits");
        food.add("vegetables");
        food.add("milkshake");
        food.remove(2);
       
        for(int i =0; i<food.size();i++)
        {
            System.out.println(food.get(i));
        }
        
    }
    
}
