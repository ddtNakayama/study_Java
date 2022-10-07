import java.util.Scanner;

public class Ensyu4_24 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		// 入力値
		int intInput = 0;

		do {
			System.out.print("整数値：");

			// キーボードから入力を受け付ける
			intInput = stdIn.nextInt();
		} while (intInput <= 0);

		// ループカウンタ
		int i = 2;

		// 割り切れる値が見つかる、または入力値を超えるまでループ
		for (; intInput > i; i++) {
			// 割り切れるか判定
			if (intInput % i == 0) {
				// 割り切れた場合はループを抜ける
				break;
			}
		}

		// ループカウンタが入力値と同じ値か判定
		if (i == intInput) {
			System.out.println("素数です。");
		} else {
			System.out.println("素数ではありません。");
		}

	}

}
