import java.util.Scanner;

public class Ensyu4_14 {

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
		int sum = 1;

		// "1"を出力
		System.out.print("1");

		// 入力された数値-1回ループ
		for (int i = 2; i <= n; i++) {

			// " + i"を出力
			System.out.print(" + " + i);

			// 合計値に加算する
			sum += i;
		}

		// " = 和"を出力
		System.out.println(" = " + sum);

	}

}
