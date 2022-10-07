import java.util.Scanner;

public class Ensyu4_12 {

	public static void main(String[] args) {
		
		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントアップします。");

		// 入力された値
		int x;

		// 0より大きい値が入力されるまでループ
		do {
			System.out.print("正の整数値：");
			// キーボードから数値の入力を受け付ける
			x = stdIn.nextInt();
		} while (x <= 0);

		// カウンタが入力された値を超えるまでループ
		for (int i = 0; x >= i; i++) {
			// カウントダウンした値を画面に出力
			System.out.println(i);
		}

	}

}
