public class FizzBuzz {
  
   public static void main(String[] args){

   for(Integer i = new Integer(1); i < 61; i++){  // if integer is smaller than 61 , then we add 1
    System.out.println();
    
	
   if(i % 3 != 0 && i % 5 != 0){  // if the integer could not be divided by 3 or 5 then the system prints the exact number

   System.out.print(i);
   }
   if(i % 3 == 0){            // if integers such as 6 which could be divided by 3. Program prints "Fizz"
	   
   System.out.print("Fizz");
   }
   if(i % 5 == 0){            //if integers could be divided by 5. Program prints "Buzz". However number which can be divided by both such as 15 Program prints "FizzBuzz" 
   System.out.print("Buzz");

   }
  }
 }
}