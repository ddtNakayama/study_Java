
public class Ensyu4_22 {

	public static void main(String[] args) {

		// ピラミッドの段数
		final int INT_ROWS = 4;

		// 底辺の*の数を計算する
		final int INT_BASE_CNT = (INT_ROWS - 1) * 2 + 1;

		// i行の*の数
		int intAstCnt = 0;
		// i行の空白の数
		int intSpaceCnt = 0;

		// 空白文字列
		String strSpace = "";
		// アスタリスク文字列
		String strAst = "";

		// ピラミッドの段数分ループ
		for (int i = 1; INT_ROWS >= i; i++) {
			
			// 文字列を初期化
			strAst = "";
			strSpace = "";

			// i行目の*の数を計算する
			intAstCnt = (i - 1) * 2 + 1;
			// i行目の片側の空白の数を計算する
			intSpaceCnt = (INT_BASE_CNT - intAstCnt) / 2;

			// 片側の空白文字列を作成する
			for (int j = 0; intSpaceCnt > j; j++) {
				strSpace += " ";
			}

			// アスタリスクの文字列を作成する
			for (int j = 0; intAstCnt > j; j++) {
				strAst += '*';
			}

			// 出力
			System.out.println(strSpace + strAst + strSpace);

		}

	}

}
