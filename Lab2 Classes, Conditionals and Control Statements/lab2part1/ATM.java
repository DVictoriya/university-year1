public class ATM{
	Integer enterMoney;  //creating two integers
	Integer balance;
Toolbox myToolbox = new Toolbox();
	 
 public static void main(String[] args){
	  
	   ATM myATM = new ATM();  //creating a new object and assigning it to method go() 
       myATM.go();	   
 }   
  public int go() {
	 
	System.out.println("Welcome to online ATM banking");
    System.out.println("How much do you want in your account?");
   enterMoney = myToolbox.readIntegerFromCmd(); // reading input from user
   balance = enterMoney;                         // assigning balance to input
   System.out.println("Bank Balance  " + balance);
   return balance;
  }
  
} 






