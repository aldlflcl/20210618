import java.util.Arrays;

public class ����10 {

	public static void main(String[] args) {
		
		int[] num = {10, 40, 60, 49 ,30};
		System.out.println("������");
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length - 1; i++) {
			
			for (int j = i + 1; j < num.length; j++) {
				
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("������");
		System.out.println(Arrays.toString(num));
	}
}
