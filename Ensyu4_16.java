import java.util.Scanner;

public class Ensyu4_16 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");

		// キーボードから入力を受け付ける
		int n = stdIn.nextInt();

		// 5回ごとの改行用カウンタ
		int cnt = 0;

		// 入力された数値分ループ
		for (int i = 0; i < n; i++) {
			System.out.print('*');

			// 5回出力したら改行する
			cnt++;
			if (cnt >= 5) {
				// 改行を出力
				System.out.println();
				// カウンタリセット
				cnt = 0;
			}
		}

	}

}
