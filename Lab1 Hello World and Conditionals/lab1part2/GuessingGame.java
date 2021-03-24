public class GuessingGame {

 
  public static void main(String[] args){ // providing a main method in order to compile the program
	  
   Integer numberToGuess;                 // providing two variables the type of the variable should mach "myToolbox.readIntegerFromCmd();" in order to read 
   Integer guessedNumber;                 // it and use it for the following statemnets

      Toolbox myToolbox = new Toolbox();
      System.out.println("Welcome to Guessing Game");   // greeting user
 
  numberToGuess = myToolbox.getRandomInteger(10);
  guessedNumber = myToolbox.readIntegerFromCmd(); 
  
  if (guessedNumber > numberToGuess) {                // if statement where we compare the numbers if the number is greater than the number to guess                                                               // prints "too high".
       System.out.println("too high"); 

  }else if(numberToGuess.equals(guessedNumber)){     //if statement where we compare the numbers if the number is equeal to the number to guess
   System.out.println("right");                      // prints "right"

  }else if (guessedNumber < numberToGuess){           //if statement where we compare the numbers if the number is smaller than the number to guess
     System.out.println("too low");                   // prints "too low"

    }
  
  }
}
