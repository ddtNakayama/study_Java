
// 自動車クラス
public class Car {
	// 名前
	private String name;

	// 幅
	private int width;

	// 高さ
	private int height;

	// 長さ
	private int length;

	// 現在位置X座標
	private double x;

	// 現在位置Y座標
	private double y;

	// 残り燃料
	private double fuel;

	// タンク容量
	private double maxFuel;

	// ナンバー
	private int number;

	// 燃費
	private double fuelCost;

	// コンストラクタ
	Car(String name, int width, int height, int length, double fuel,
			double maxFuel, int number, double fuelCost) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		x = y = 0.0;

		this.maxFuel = maxFuel;
		this.number = number;
		this.fuelCost = fuelCost;
	}

	// 現在位置X座標を取得
	double getX() {
		return x;
	}

	// 現在位置Y座標を取得
	double getY() {
		return y;
	}

	// 残り燃料を取得
	double getFuel() {
		return fuel;
	}

	// スペック表示
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");

		System.out.println("ナンバー：" + number);
	}

	// X方向にdx・Y方向にdy移動
	boolean move(double dx, double dy) {
		// 移動距離
		double dist = Math.sqrt(dx * dx + dy * dy);

		// 消費燃料
		double consumeFuel = dist * fuelCost;
		
		if (consumeFuel > fuel) {
			// 燃料不足のため移動不可
			return false;
		} else {
			// 移動距離の分だけ燃料が減る
			fuel -= consumeFuel;

			x += dx;
			y += dy;

			// 移動完了
			return true;
		}
	}
	
	// 給油
	boolean AddFuel(double fuel) {
		
		// タンク容量を超えないか確認
		if(this.maxFuel > this.fuel + fuel ) {
			return false;
		}
		
		// 残り燃料に加算
		this.fuel+= fuel;
		
		// 給油完了
		return true;
	}

}
