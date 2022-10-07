import java.util.Scanner;

public class Ensyu3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("整数a：");
		int a = scan.nextInt();
		System.out.print("整数b：");
		int b = scan.nextInt();

		int max = 0;
		int min = 0;

		if (a == b) {
			System.out.println("二つの値は同じです。");
		} else {
			if (a < b) {
				max = b;
				min = a;
			} else {
				max = a;
				min = b;
			}
			System.out.println("小さいほうの値は" + min + "です。");
			System.out.println("大きいほうの値は" + max + "です。");
		}

	}

}
