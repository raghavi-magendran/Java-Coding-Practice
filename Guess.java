import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args)
    {
      int guesses = 0;
      System.out.println("Hello!!! Welcome to Number Guessing game");
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Please enter your name: ");
      String name = scanner.next();
      System.out.println("Hello " + name);
      
      Random random = new Random();
      int randomNum = random.nextInt(100)+1; 
       
      System.out.println("Should we start the game ??? (Y/N)");
         String choice = scanner.next();
         choice = choice.toUpperCase();
          
       while (guesses < 5)
         {
            if(choice.equals("Y"))
            {
               System.out.println("Guess a number: ");
               int g = scanner.nextInt();
               guesses++;
                  if(g > randomNum)
                  {
                     System.out.println("Your guessed number is higher than the actual number");
                  }
                  else if(g < randomNum)
                  {
                     System.out.println("Your guessed number is lower than actual number");
                  }
                  else
                  {
                     System.out.println("Congratulations, You have guessed the correct number: " + randomNum);
                     System.out.println("No. of guesses: " + guesses);
                     break;
                  }
             }
             else if(choice.equals("N"))
             {
               System.out.println("Bye");
               break;
             }
              else
             {
               System.out.println("Please choose an valid option. Only (Y/N)");
               break;
             }
      } 
      if (guesses == 5)
      {
        System.out.println("You only get 5 chances. Better luck next time.");
        System.out.println("The Actual number was:" + randomNum);
      }
      scanner.close();
    }
  
}
