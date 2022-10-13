import java.time.LocalDateTime;
import java.util.Calendar;

// 演習10-4

public class Day {

	// 月の最小
	private final int MIN_MONTH = 1;
	// 月の最大
	private final int MAX_MONTH = 12;
	// 日の最小
	private final int MIN_DATE = 1;

	// 年
	private int year = 1;
	// 月
	private int month = 1;
	// 日
	private int date = 1;

	//y年は閏年か？
	public static boolean isLeap(int y) {
		return y % 4 == 0 & y % 100 != 0 || y % 400 == 0;
	}

	// コンストラクタ
	public Day() {
		// 現在日付で年月日を初期化する
		LocalDateTime dateNow = LocalDateTime.now();
		this.year = dateNow.getYear();
		this.month = dateNow.getMonthValue();
		this.date = dateNow.getDayOfMonth();
	}

	// コンストラクタ
	public Day(int year) {
		this.year = year;
	}

	// コンストラクタ
	public Day(int year, int month) {
		this(year);

		// 入力値修正用
		int tmpMonth = 0;

		// 月が不正の値であれば範囲内に修正する
		if (month < MIN_MONTH) {
			tmpMonth = MIN_MONTH;
		} else if (month > MAX_MONTH) {
			tmpMonth = MAX_MONTH;
		}

		this.month = tmpMonth;
	}

	// コンストラクタ
	public Day(int year, int month, int date) {
		this(year, month);

		// 入力値修正用
		int tmpDate = 0;

		// 対象月の末日を取得する
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		int maxDate = cal.getActualMaximum(Calendar.DATE);

		// 日が不正の値であれば範囲内に修正する
		if (date < MIN_DATE) {
			tmpDate = MIN_DATE;
		} else if (month > maxDate) {
			tmpDate = maxDate;
		}

		this.date = tmpDate;
	}

	// コンストラクタ
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}

	// 年を取得
	public int getYear() {
		return year;
	}

	// 月を取得
	public int getMonth(int month) {
		return month;
	}

	// 日を取得
	public int getDay() {
		return date;
	}

	// 年を設定
	public void setYear(int year) {
		this.year = year;
	}

	// 月を設定
	public void setMonth(int month) {
		this.month = month;
	}

	// 日を設定
	public void setDate(int date) {
		this.date = date;
	}

	// 年月日を設定
	public void set(int year, int month, int date) {
		// 年
		this.year = year;
		// 月
		this.month = month;
		// 日
		this.date = date;
	}

	// 閏年か？
	public boolean isLeap() {
		return isLeap(year);
	}

	// 曜日を求める
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 日付と等しいか
	public boolean equalTo(Day d) {
		return year == d.year && month == d.month && date == d.date;
	}

	// 文字列表現を返却
	public String toString() {
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		return String.format("%04d年%02d月%02d日(&s)", year, month, date, wd[dayOfWeek()]);
	}

	// 年内の経過日数取得
	public long getElapsedDay() {
		// 起点（設定年の元旦）
		Calendar startCal = Calendar.getInstance();
		startCal.set(year, 0, 1);

		// 終点（設定日付）
		Calendar endCal = Calendar.getInstance();
		endCal.set(year, month - 1, date);

		// 起点をミリ秒に変換
		long startToMilliSec = startCal.getTimeInMillis();
		// 終点をミリ秒に変換
		long endToMilliSec = endCal.getTimeInMillis();

		// 経過日数を返却
		return Math.abs(startToMilliSec - endToMilliSec) / (1000 * 60 * 60 * 24);
	}

	// 年内の残り日数取得
	public long getRemainDay() {
		// 起点（設定日付）
		Calendar startCal = Calendar.getInstance();
		startCal.set(year, month - 1, date);

		// 終点（設定年の最終日）
		Calendar endCal = Calendar.getInstance();
		endCal.set(year, MAX_MONTH - 1, 31);

		// 起点をミリ秒に変換
		long startToMilliSec = startCal.getTimeInMillis();
		// 終点をミリ秒に変換
		long endToMilliSec = endCal.getTimeInMillis();

		// 経過日数を返却
		return Math.abs(startToMilliSec - endToMilliSec) / (1000 * 60 * 60 * 24);
	}

	// 日付比較
	// 戻り値：
	// -1：より前の日付
	//  0：同じ日付
	//  1：より後ろの日付
	public int getRelation(int year, int month, int date) {
		// 年の比較
		if (this.year > year) {
			return 1;
		} else if (this.year < year) {
			return -1;
		} else {
			// 月の比較
			if(this.month > month) {
				return 1;
			}else if(this.month < month) {
				return -1;
			}else {
				// 日の比較
				if(this.date > date) {
					return  1;
				}else if(this.date < date) {
					return -1;
				}else {
					return 0;
				}
			}
		}
	}
	
	// 日付比較
	// 戻り値：
	// -1：引数1 < 引数2
	//  0：同じ日付
	//  1：引数1 > 引数2	
	public static int getRelation(Calendar cal1,Calendar cal2) {
		return cal1.compareTo(cal2);
	}
	
}
