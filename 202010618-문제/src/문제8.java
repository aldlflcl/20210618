
public class ����8 {

	public static void main(String[] args) {
		
		int[] num = {94, 85, 95, 88, 90};
		int min = num[0];
		int max = num[0];
		
		for(int i : num) {
			if(i < min) {
				min = i;
			}
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("�ּҰ�: "+ min);
		System.out.println("�ִ밪: "+ max);
	}
}
