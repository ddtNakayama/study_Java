import java.util.Scanner;

public class Ensyu4_15 {

	public static void main(String[] args) {

		// 標準体重を計算するために必要な固定値
		final int INT_STANDARD_WEIGHT1 = 100;
		final double DOUBLE_STANDARD_WEIGHT2 = 0.9;

		//標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何cmから：");
		// 開始身長
		int intStartHeight = stdIn.nextInt();

		// 終了身長
		System.out.print("何cmまで：");
		int intEndHeight = stdIn.nextInt();

		// 加算する身長
		System.out.print("何cmごと：");
		int intAddHeight = stdIn.nextInt();

		System.out.println("身長 標準体重");

		// 標準体重
		double doubleStandardWeight = 0;

		// 開始身長が終了身長を超えるまでループ
		for (; intEndHeight >= intStartHeight; intStartHeight += intAddHeight) {

			// 標準体重を計算
			doubleStandardWeight = (intStartHeight - INT_STANDARD_WEIGHT1) * DOUBLE_STANDARD_WEIGHT2;
			System.out.println(intStartHeight + "  " + doubleStandardWeight);
		}

	}

}
