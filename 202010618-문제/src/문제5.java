
public class ����5 {

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
		System.out.println("7�� ����� ��: " + multi7);
		System.out.println("9�� ����� ��: " + multi9);
		System.out.println("7�� ����� �� + 9�� ����� ��: " + sum);
	}
}
