
public class ����3 {

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
		
		System.out.println("Ȧ�� ��: " + oddSum + "  ¦�� ��: " + evSum);
	}
}
