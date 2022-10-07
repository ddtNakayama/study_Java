import java.util.Random;
import java.util.Scanner;

public class Ensyu2_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("整数値：");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		Random random = new Random();
		int b = random.nextInt(11);

		System.out.println("その値の±5の乱数を生成しました。それは" + (a - 5 + b) + "です。");
	}

}
