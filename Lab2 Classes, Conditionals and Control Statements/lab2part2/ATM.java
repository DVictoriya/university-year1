public class ATM{
	Integer enterMoney;
	Integer enterNumber;
	Integer balance;
	Integer withdral;
	Integer deposit;
	Integer  inquire;
	Integer quit;
	Toolbox myToolbox = new Toolbox();
	
	public static void main(String[] args){ //creating new object and assigning it to method go()
	  ATM myATM = new ATM();
       myATM.go();	
     	   }   
		   
		   public int go() {
	  
	  System.out.println("Welcome to online ATM banking");
    System.out.println("How much do you want in your account?");
   enterMoney = myToolbox.readIntegerFromCmd();               // reading input from user
   balance = enterMoney;                                    // assigning balance to input
   System.out.println("Bank Balance  " + balance);          
   System.out.println("");
   System.out.println("");
   System.out.println("What do you want to do?"); //continue process 
	  System.out.println("1 : Withdral");
	  System.out.println("2 : Deposit");
	  System.out.println("3 : Inquire");
	  System.out.println("4 : Quit");
	  
	    withdral = 1; //assigning withdral to 1
		deposit=2;  //assigning deposit to 2
		inquire=3; //assigning inquire to 3
		quit =4;  //assigning quit to 4
		
		 enterMoney = myToolbox.readIntegerFromCmd();
		if (enterMoney.equals(withdral)){   // if the input from the user equals withdral, calling withdralMoney method
			withdralMoney();
		
		}else if(enterMoney.equals(deposit)){ // if the input from the user equals deposit, calling depositMoney method
			depositMoney();
		
		}else if(enterMoney.equals(inquire)){  // if the input from the user equals inquire, calling inquireBalance method
			inquireBalance();
			
		
		}else if(enterMoney.equals(quit)){  // if the input from the user equals quit, calling quitMoney method
			quitMoney();
		}
			
 return 0;
	}
	public int withdralMoney(){
		System.out.println("**************************");  
		System.out.println("   Withdral    ");
		System.out.println("**************************");
		System.out.println("How much would you like to withdral?");
		enterMoney = myToolbox.readIntegerFromCmd(); // reading input from user
		System.out.println("**************************");
		withdral= enterMoney;                               //assigning withdral to user input 
		balance = balance - withdral;                        //calculating balance
		System.out.println("Your Balanace is "+ balance);
		return withdral;
	}
	
	public int depositMoney(){ 
		System.out.println("**************************");  
		System.out.println("   Deposit    ");
		System.out.println("**************************"); 
		System.out.println("How much would you like to deposit?");
		enterMoney = myToolbox.readIntegerFromCmd();      // reading input from user
		System.out.println("**************************");
		deposit= enterMoney;                                 // assigning deposit to user input
		balance = balance + deposit;                         // calculating balance
		System.out.println("Your Balanace is "+ balance);
		return deposit;
	}
	public int inquireBalance(){  
		System.out.println("**************************");  
        System.out.println("Your balance is " + balance);  // printing balance
		System.out.println("**************************");
		return inquire;
	}
	public int quitMoney(){  
		System.out.println("**************************");  
        System.out.println("         GoodBey!            "); 
		System.out.println("**************************");
		return quit;
	}
}