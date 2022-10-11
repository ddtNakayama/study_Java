// 演習12-1

// 自動車クラス
public class newCar extends Car {

	// 総走行距離
	private int totalMileage = 0;

	// コンストラクタ
	newCar(String name, int width, int height, int length, double fuel, Day purchaseDay) {
		super(name, width, height, length, fuel, purchaseDay);
		
	}

	// 総走行距離を返却する
	public int getTotalMileage() {
		return totalMileage;
	}

}
