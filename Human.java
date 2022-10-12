// 人間クラス
public class Human {

	// 名前
	private String strName;

	// 身長
	private int intHeight;

	// 体重
	private int intWeight;

	// コンストラクタ
	Human(String strName, int intHeight, int intWeight) {
		// 名前、身長、体重を設定する
		this.strName = strName;
		this.intHeight = intHeight;
		this.intWeight = intWeight;
	}

	// 名前を返却する
	public String getName() {
		return this.strName;
	}

	// 身長を返却する
	public int getHeight() {
		return this.intHeight;
	}

	// 体重を返却する
	public int getWeight() {
		return this.intWeight;
	}

	// 名前を更新する
	public boolean setName(String strName) {
		// 入力値チェック
		if (strName == null || strName.length() == 0) {
			return false;
		}

		// 名前を更新
		this.strName = strName;

		return true;
	}

	// 身長を更新する
	public boolean setHeight(int intHeight) {
		// 入力値チェック
		if (intHeight < 0) {
			return false;
		}

		// 身長を更新する
		this.intHeight = intHeight;

		return true;
	}

	// 体重を更新する
	public boolean setWeight(int intWeight) {
		// 入力値チェック
		if (intWeight < 0) {
			return false;
		}

		// 体重を更新する
		this.intWeight = intWeight;

		return true;
	}

}
