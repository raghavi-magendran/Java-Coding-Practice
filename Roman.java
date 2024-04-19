import java.util.HashMap;
public class Roman {
    public static void main(String[] args) {
        HashMap<String,Integer> romanNum = new HashMap<>();
        romanNum.put("I",1);
        romanNum.put("V",5);
        romanNum.put("X",10);
        romanNum.put("L",50);
        romanNum.put("C",100);
        romanNum.put("D",500);
        romanNum.put("M",1000);
        System.out.println(romanNum);
    }
    public static int RomantoInt(String s)
    {
        HashMap<String,Integer> romanNum = new HashMap<>();
        romanNum.put("I",1);
        romanNum.put("V",5);
        romanNum.put("X",10);
        romanNum.put("L",50);
        romanNum.put("C",100);
        romanNum.put("D",500);
        romanNum.put("M",1000);
        System.out.println(romanNum.get("L"));

        if (s.length()<=15)
        {
            
            return 1;
        }
        
        else {return 0;}
    }
}
