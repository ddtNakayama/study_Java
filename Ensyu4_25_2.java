import java.util.Scanner;

public class Ensyu4_25_2 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数を加算します。");
		System.out.print("何個加算しますか：");

		// 加算する個数
		int n = stdIn.nextInt();
		// 合計値
		int sum = 0;
		// 入力数
		int cnt = 0;

		// 加算する個数までループ
		for (int i = 0; i < n; i++) {
			System.out.print("整数：");
			// キーボードから入力を受け付ける
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			// 合計値を計算
			sum += t;
			// 入力数を更新
			cnt++;
		}
		System.out.println("合計は" + sum + "です。");
		System.out.println("平均は" + (sum / cnt) + "です。");
	}

}
