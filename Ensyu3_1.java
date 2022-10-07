import java.util.Scanner;

public class Ensyu3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("整数値：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a < 0) {
			a *= -1;
		}
		System.out.println("その絶対値は" + a + "です。");
	}

}
