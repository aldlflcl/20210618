
public class 문제5 {

	public static void main(String[] args) {
		
		int multi7 = 0;
		int multi9 = 0;
		
		for (int i = 1; i <= 1000; i++) {
			
			if(i % 7 == 0) {
				multi7 += i;
			}
			if(i % 9 == 0) {
				multi9 += i;
			}
		}
		
		int sum = multi7 + multi9;
		System.out.println("7의 배수의 합: " + multi7);
		System.out.println("9의 배수의 합: " + multi9);
		System.out.println("7의 배수의 합 + 9의 배수의 합: " + sum);
	}
}
