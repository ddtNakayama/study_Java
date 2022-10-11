// 演習12-2

public class Ensyu12_2 {

	// 定期預金付き銀行口座比較
	static int compBalance(Account a, Account b) {

		// aの預金合計値
		long sumOfA;

		// bの預金合計値
		long sumOfB;

		// aが定期預金付き銀行口座ならば、普通預金と定期預金残高の合計値を比較対象とする
		if (a instanceof TimeAccount) {
			sumOfA = ((TimeAccount) a).getTimeBalance() + a.getBalance();
		} else {
			sumOfA = a.getBalance();
		}

		// bが定期預金付き銀行口座ならば、普通預金と定期預金残高の合計値を比較対象とする
		if (b instanceof TimeAccount) {
			sumOfB = ((TimeAccount) b).getTimeBalance() + b.getBalance();
		} else {
			sumOfB = b.getBalance();
		}

		// 比較
		if (sumOfA > sumOfB) {
			return 1;
		} else if (sumOfA < sumOfB) {
			return -1;
		} else {
			return 0;
		}
	}

}
