// 演習10-3

// 最大最小判定クラス
public final class MinMax {

	// 最大値を返却する
	public static int getMax(int int1, int int2) {
		// 引数1と引数2を比較する
		if (int1 > int2) {
			// 引数1を返却する
			return int1;
		} else {
			// 引数2を返却する
			return int2;
		}
	}

	// 最大値を返却する
	public static int getMax(int int1, int int2, int int3) {

		// 最大値
		int tmpMax = 0;

		// 引数1と引数2を比較する
		tmpMax = MinMax.getMax(int1, int2);

		// 引数1と引数2の大きいほうと引数3を比較する
		tmpMax = MinMax.getMax(tmpMax, int3);

		// 最大値を返却する
		return tmpMax;
	}

	// 最大値を返却する
	public static int getMax(int[] intArray) {

		// 最大値
		int tmpMax = 0;

		// 入力値チェック
		if (intArray == null) {
			return tmpMax;
		}

		// 配列の要素数分ループ
		for (int i = 0; i < intArray.length; i++) {
			// 配列の先頭から大きい値を取得して比較を繰り返す
			tmpMax = MinMax.getMax(tmpMax, intArray[i]);
		}

		return tmpMax;
	}

	// 最小値を返却する
	public static int getMin(int int1, int int2) {
		// 引数1と引数2を比較する
		if (int1 < int2) {
			// 引数1を返却する
			return int1;
		} else {
			// 引数2を返却する
			return int2;
		}
	}

	// 最小値を返却する
	public static int getMin(int int1, int int2, int int3) {

		// 最小値
		int tmpMin = Integer.MAX_VALUE;

		// 引数1と引数2を比較する
		tmpMin = MinMax.getMin(int1, int2);

		// 引数1と引数2の小さいほうと引数3を比較する
		tmpMin = MinMax.getMin(tmpMin, int3);

		// 最小値を返却する
		return tmpMin;
	}

	// 最小値を返却する
	public static int getMin(int[] intArray) {

		// 最小値
		int tmpMin = Integer.MAX_VALUE;

		// 入力値チェック
		if (intArray == null) {
			return tmpMin;
		}

		// 配列の要素数分ループ
		for (int i = 0; i < intArray.length; i++) {
			// 配列の先頭から大きい値を取得して比較を繰り返す
			tmpMin = MinMax.getMax(tmpMin, intArray[i]);
		}

		return tmpMin;
	}

}
