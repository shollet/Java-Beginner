
public class Main {

	public static void main(String[] args) {
		char myChar = 'X';
		
		switch(myChar) {
			case 'A':
				System.out.println("The letter is " + myChar + " for Able");
				break;
			case 'B':
				System.out.println("The letter is " + myChar + " for Baker");
				break;
			case 'C':
				System.out.println("The letter is " + myChar + " for Charlie");
				break;
			case 'D':
				System.out.println("The letter is " + myChar + " for Dog");
				break;
			case 'E':
				System.out.println("The letter is " + myChar + " for Easy");
				break;
			default:
				System.out.println("The letter is " + myChar + " but is not found");
				break;
		}

	}
	
}
