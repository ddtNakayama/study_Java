import java.util.Random;
import java.util.Scanner;

public class Ensyu4_27 {

	public static void main(String[] args) {

		// 回答回数
		int intLimit = 5;

		// 乱数
		Random rand = new Random();
		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		// 0～99の乱数を生成
		int no = rand.nextInt(100);

		System.out.println("数当てゲーム開始");
		System.out.println("0～99の数を当ててください。");

		int x;

		// 正解を当てる、または回答回数を超えるまでループ
		do {
			System.out.println("残り回答回数：" + intLimit);
			System.out.print("いくつかな：");

			// キーボードから入力を受け付ける
			x = stdIn.nextInt();

			// 入力値と正解の値を比較
			if (x > no) {
				System.out.println("もっと小さな数だよ。");
			} else if (x < no) {
				System.out.println("もっと大きな数だよ。");
			}

			// 回答回数を減算
			intLimit--;
			// 回答回数が0以下になったらループ終了
			if (intLimit <= 0) {
				break;
			}

		} while (x != no);

		// 正否判定
		if (x == no) {
			System.out.println("正解です。");
		} else {
			System.out.println("正解は" + no + "でした。");
		}

	}

}
