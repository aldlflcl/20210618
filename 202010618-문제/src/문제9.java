
public class ����9 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		int sum = 0;
		double avg = 0.0;
		System.out.println("���� �迭");
		for(int i = 0; i < num.length; i++) {
			
			num[i] = (int)(Math.random() * 10) + 1;
			System.out.printf("%d ", num[i]);
			sum += num[i];
		}
		
		avg = sum / 10.0;
		
		System.out.println();
		System.out.println("��� ��:" + avg);
	}
}
