import java.util.Scanner;

public class Ensyu4_13 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1からnまでの和を求めます。");

		// 入力された数値
		int n;

		// 0より大きい値が入力されるまでループ
		do {
			System.out.print("nの値");

			// キーボードからの入力受付
			n = stdIn.nextInt();

		} while (n <= 0);

		// 合計値
		int sum = 0;

		// 入力された数値だけループ
		for (int i = 1; i <= n; i++) {
			// 合計値に加算する
			sum += i;
		}

		System.out.println("1から" + n + "までの和は" + sum + "です。");

	}

}
