// 演習10-2

// 連番クラス
public class ExId {
	// 何番までの識別番号を与えたか
	static int counter = 0;

	// 識別番号
	private int id;

	// 識別番号に加算する値
	private static int addNo = 1;

	// コンストラクタ
	public ExId() {
		// 識別番号を加算する
		counter += addNo;

		// 識別番号
		id = counter;
	}

	// 識別番号を返却
	static int getMaxId() {
		return counter;
	}

	// 識別番号を取得
	public int getId() {
		return id;
	}

	// 識別番号に加算する値を返却する
	public static int getAddNo() {
		return addNo;
	}

	// 識別番号に加算する値を更新する
	public static boolean setAddNo(int addNo) {

		// 入力値チェック
		if (addNo < 0) {
			// 負数は処理しない
			return false;
		}

		// 識別番号に加算する値を更新
		ExId.addNo = addNo;

		return true;
	}

}
