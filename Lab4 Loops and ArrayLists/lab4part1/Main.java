
public class Main {
	public static void main(String[] args) {
		Integer numberToMultiply;
		Toolbox myToolbox = new Toolbox();
		numberToMultiply = myToolbox.readIntegerFromCmd(); // user enters value
		for (int i = 2; i <= 20; i++) {                 // if the user input equals 2 and it is less than 20, add 1 to the user input
			System.out.println(numberToMultiply * i);  // then multiply it by the same number

		}
		int i = 1;     //  creating a new varialble of type int and assigning value 1
		int sum = 0;      //  creating a new varialble of type int and assigning value 0
		while (i <= 500) { // while the newely created variable is less than 500
			sum++;         //  we increase the sum by one 
			System.out.println(i); 
			i++;
		}
		System.out.println(sum); 
	}
}
