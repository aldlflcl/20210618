
public class ����1 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("7�� ��� ����: " + count + "  7�� ����� ��: " + sum);
	}
}
