
public class TimeAccount extends Account {

	// 預金残高（定期預金）
	private long timeBalance;

	// コンストラクタ
	TimeAccount(String name, String no, long balance, long timeBalance) {
		// クラスAccountのコンストラクタの呼び出し
		super(name, no, balance);
		// 預金残高（定期預金）
		this.timeBalance = timeBalance;
	}

	// 定期預金残高を調べる
	long getTimeBalance() {
		return timeBalance;
	}

	// 定期預金を解約して全額を普通預金に移す
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0;
	}

}
