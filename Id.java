// 演習10-1

// 連番クラス
public class Id {
	// 何番までの識別番号を与えたか
	static int counter = 0;

	// 識別番号
	private int id;

	// コンストラクタ
	public Id() {
		// 識別番号
		id = ++counter;
	}

	// 識別番号を返却
	static int getMaxId() {
		return counter;
	}

	// 識別番号を取得
	public int getId() {
		// クラスメソッドを呼び出す
		return Id.getMaxId();
	}

}