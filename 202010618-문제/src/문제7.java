import java.util.Scanner;

public class ����7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int score = scan.nextInt();
		
		if(score < 60) {
			System.out.println("���հ�");
		} else {
			System.out.println("�հ�");
		}
	}
}
