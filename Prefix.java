public class Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","fly"};
        longestCommonPrefix(strs);

    }
    public static String longestCommonPrefix(String[] strs)
    {
        
        for(int i = 0; i<strs.length; i++)
        {
            String value = strs[i];

            for(int j = 0; j<value.length(); j++)
            {
                char c = value.charAt(j);
                 
                  for (int k=i+1; k<strs.length; k++)
                  {
                      String next = strs[k];
                      if(next.indexOf(c) != 1)
                      {
                        System.out.print(c);
                      }
                  }
            }
        }
        return null;

    }
}
