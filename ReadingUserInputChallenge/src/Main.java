import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double sum = 0;
		int count = 1;
		
		
		do {
			System.out.println("Enter number #" + count + ": ");
			String nextNumber = scanner.nextLine();
			try {
//				int number = Integer.parseInt(nextNumber);
				double number = Double.parseDouble(nextNumber);
				count++;
				sum += number;
			} catch (NumberFormatException nfe) {
				System.out.println("Invalid number");
			}
		} while (count <= 5);
		
		System.out.println("The sum of the 5 numbers = " + sum);
		scanner.close();

	}

}
