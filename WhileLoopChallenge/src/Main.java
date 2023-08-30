
public class Main {

	public static void main(String[] args) {
		int i = 5;
		int evenCount = 0;
		int oddCount = 0;
		
		while (i <= 20) {
			if (isEvenNumber(i) == true) {
				System.out.println(i);
				evenCount++;
				if (evenCount == 5) {
					break;
				}
			} else {
				oddCount++;
			}
			i++;
		}
		
		System.out.println("evenCount = " + evenCount);
		System.out.println("oddCount = " + oddCount);

	}
	
	public static boolean isEvenNumber(int number) {
		
		if (number % 2 == 0) {
			return true;
		}
		
		return false;
	}

}
