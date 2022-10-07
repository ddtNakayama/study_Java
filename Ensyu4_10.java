import java.util.Scanner;

public class Ensyu4_10 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		// キーボードから数値の入力を受け付ける
		int n = stdIn.nextInt();

		// 入力された値が1以上
		if (n >= 1) {

			// 入力された値の数だけループ
			for (int i = 0; i < n; i++) {
				// *を画面に出力
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}
	}

}
