import java.util.Scanner;

public class Ensyu3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("整数a：");
		int a = scan.nextInt();
		System.out.print("整数b：");
		int b = scan.nextInt();

		if (b > a) {
			int t = b;
			b = a;
			a = t;
		}

		System.out.println("a≧bとなるようにソートしました。");
		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
	}

}
