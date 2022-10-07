import java.util.Scanner;

public class Ensyu3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		if (a >= 0 && a <= 59) {
			System.out.println("不可");
		} else if (a >= 60 && a <= 69) {
			System.out.println("可");
		} else if (a >= 70 && a <= 79) {
			System.out.println("良");
		} else if (a >= 80 && a <= 100) {
			System.out.println("優");
		} else {
			System.out.println("それ以外");
		}

	}

}
