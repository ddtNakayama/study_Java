import java.util.Scanner;

public class Ensyu3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("整数a：");
		int a = scan.nextInt();
		System.out.print("整数b：");
		int b = scan.nextInt();
		System.out.print("整数c：");
		int c = scan.nextInt();

		System.out.println("昇順にソートします。");

		int t = 0;
		if (a > b) {
			t = b;
			b = a;
			a = t;
		}

		if (b > c) {
			t = c;
			c = b;
			b = t;

		}
		if (a > b) {
			t = b;
			b = a;
			a = t;
		}

		System.out.println("整数a：" + a);
		System.out.println("整数b：" + b);
		System.out.println("整数c：" + c);
	}

}
