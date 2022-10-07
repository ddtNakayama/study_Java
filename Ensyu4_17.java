import java.util.Scanner;

public class Ensyu4_17 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");

		// キーボードから入力を受け付ける
		int n = stdIn.nextInt();

		// 約数の個数
		int cnt = 0;

		// 入力された数値分ループ
		for (int i = 1; i <= n; i++) {

			// 割り切れるか判定
			if (n % i == 0) {
				System.out.println(i);

				// 約数の個数を加算
				cnt++;
			}
		}
		System.out.print("約数は" + cnt + "個です。");

	}

}
