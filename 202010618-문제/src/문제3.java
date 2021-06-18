
public class ¹®Á¦3 {

	public static void main(String[] args) {
		
		int oddSum = 0;
		int evSum = 0;
		
		for (int i = 0; i <= 30; i++) {
			
			if (i % 2 == 0) {
				evSum += i;
			} else {
				oddSum += i;
			}
		}
		
		System.out.println("È¦¼ö ÇÕ: " + oddSum + "  Â¦¼ö ÇÕ: " + evSum);
	}
}
