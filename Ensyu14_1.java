
public class Ensyu14_1 {

	public static void main(String[] args) {

		// 長方形と平行四辺形の面積を表示する
		// 配列に実装クラスを格納する
		Plane2D planeArray[] = new Plane2D[2];

		// 長方形：底辺2、高さ3
		Rectangle rect = new Rectangle(2, 3);

		// 平行四辺形：底辺4、高さ5
		Parallelogram para = new Parallelogram(4, 5);

		// 長方形、平行四辺形をセット
		planeArray[0] = rect;
		planeArray[1] = para;

		// 配列の要素数分ループ
		for (int i = 0; i < planeArray.length; i++) {
			// 実装クラスの情報を表示する
			System.out.println(planeArray[i].toString());
			// 各実装クラスごとの面積を表示する
			System.out.println("面積:" + planeArray[i].getArea());
		}
	}

}
