
public class StringArray {
    public static void main(String[] args) {
        String[] aArray={"cat","dog","bird","sheep"};
        String[] bArray={"map","horn","dog","sheep"};
        
        for(int i=0;i<aArray.length;i++)
        {
            for(int j=0;j<bArray.length;j++)
            {
                boolean res = aArray[i].equals(bArray[j]);
                
                if(res == true)
                {
                    System.out.println(res);
                    System.out.println("The common value is:  "+aArray[i]);
                }
            }
        }
        
    }
    
}
