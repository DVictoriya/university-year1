public class ATM {
	Integer enterMoney;
	Integer balance;
	Integer withdral;
	Integer deposit;
	Integer inquire;
	Integer quit;
	Toolbox myToolbox = new Toolbox();

	public static void main(String[] args) {  
		ATM myATM = new ATM();       //creating new object and assigning it to method go()
		myATM.go();
	}

	public void go() {
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		enterMoney = myToolbox.readIntegerFromCmd();                     // reading input from user
		balance = enterMoney;                                  // assigning balance to input
		System.out.println("Bank Balance  " + balance);
		System.out.println("");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdral");
		System.out.println("2 : Deposit");
		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		withdral = 1;  //assigning withdral to 1
		deposit = 2; //assigning deposit to 2
		inquire = 3; //assigning inquire to 3
		quit = 4;    //assigning quit to 4

		while (true) {                                      // while statement which allows the user to choose constantly different options
			enterMoney = myToolbox.readIntegerFromCmd();
			if (enterMoney.equals(withdral)) {
				withdralMoney();
				System.out.println("     ");
				System.out.println("What do you want to do?");
				System.out.println("1 : Withdral");
				System.out.println("2 : Deposit");
				System.out.println("3 : Inquire");
				System.out.println("4 : Quit");
			} else if (enterMoney.equals(deposit)) {
				depositMoney();
				System.out.println("     ");
				System.out.println("What do you want to do?");
				System.out.println("1 : Withdral");
				System.out.println("2 : Deposit");
				System.out.println("3 : Inquire");
				System.out.println("4 : Quit");

			} else if (enterMoney.equals(inquire)) {
				inquireBalance();
				System.out.println("     ");
				System.out.println("What do you want to do?");
				System.out.println("1 : Withdral");
				System.out.println("2 : Deposit");
				System.out.println("3 : Inquire");
				System.out.println("4 : Quit");

			} else if (enterMoney.equals(quit)) {
				quitMoney();
			}
		}
	}

	public void withdralMoney() {
		System.out.println("**********************");
		System.out.println("   Withdral    ");
		System.out.println("**********************");
		System.out.println("How much would you like to withdral?");
		enterMoney = myToolbox.readIntegerFromCmd();                    // reading input from user
		while (enterMoney > balance || enterMoney <= 0) {            //while statement which indicates that if the user input is bigger or the balance is 0. User can try again
			System.out.println("Sorry inefficient balance, add more money");
			enterMoney = myToolbox.readIntegerFromCmd();
		}
		System.out.println("**********************");
		withdral = enterMoney;                             //assigning withdral to user input 
		balance = balance - withdral;                      //calculating balance
		System.out.println("Your Balanace is " + balance);
		
	}

	public void depositMoney() {
		System.out.println("**********************");
		System.out.println("   Deposit    ");
		System.out.println("**********************");
		System.out.println("How much would you like to deposit?");
		enterMoney = myToolbox.readIntegerFromCmd();
		while(enterMoney <= 0){                             //while statement which indicates that if the user input (deposit) is smaller or equal to 0. User can try again
			System.out.println("Sorry inefficient balance, add more money");
			enterMoney = myToolbox.readIntegerFromCmd();
		}
		System.out.println("**********************");
		deposit = enterMoney;                         //assigning withdral to user input 
		balance = balance + deposit;                 //calculating balance
		System.out.println("Your Balanace is " + balance);   
		
	}

	public void inquireBalance() {
		System.out.println("**********************");
		System.out.println("Your balance is " + balance);
		System.out.println("**********************");
	}

	public void quitMoney() {
		System.out.println("**********************");
		System.out.println("         GoodBye!            ");
		System.out.println("**********************");
		
		System.exit(0);  // stops loop and exits program 
	}
}