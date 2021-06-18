
public class ¹®Á¦2 {
	public static void main(String[] args) {
		
		
		int sum = 0;
		int count = 0;
		
		for (int i = 100; i <= 999; i++) {
			
			if (i % 4 != 0) {
				count++;
				sum += i;
			}
		}
		
		System.out.println("°¹¼ö: " + count + "   ÇÕ: " + sum);
	}
}
