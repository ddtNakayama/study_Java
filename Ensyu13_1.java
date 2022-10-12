import java.util.Scanner;

// 演習13-1

public class Ensyu13_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("図形は何個：");

		// 出力する図形の数
		int count = 0;

		do {
			// 出力する図形の数をキーボードから入力する
			count = stdIn.nextInt();

		} while (count < 0);

		Shape[] shapeArray = new Shape[count];

		// 表示番号
		int DispNo = 1;

		// 図形番号
		int shapeNo = 0;

		// 長さ
		int length = 0;

		// 幅
		int width = 0;

		// 高さ
		int height = 0;

		// 配列の要素数分ループ
		for (int i = 0; i < shapeArray.length; i++) {
			do {
				System.out.print(DispNo + "番の図形の種類（1…点／2…水平直線／3…垂直直線／4…長方形");
				// 図形の種類をキーボードから入力する
				shapeNo = stdIn.nextInt();
			} while (shapeNo < 1 || shapeNo > 4);

			switch (shapeNo) {
			case 1:
				// 点
				shapeArray[i] = new Point();
				break;
			case 2:
				// 水平直線
				// 長さを求める
				do {
					System.out.print("長さ：");
					length = stdIn.nextInt();
				} while (length < 1);
				shapeArray[i] = new HorzLine(length);
				break;
			case 3:
				// 垂直直線
				// 長さを求める
				do {
					System.out.print("長さ：");
					length = stdIn.nextInt();
				} while (length < 1);
				shapeArray[i] = new VirtLine(length);
				break;

			case 4:
				// 長方形
				// 幅を求める
				do {
					System.out.print("幅：");
					width = stdIn.nextInt();
				} while (width < 1);
				// 高さを求める
				do {
					System.out.print("高さ：");
					height = stdIn.nextInt();
				} while (height < 1);
				shapeArray[i] = new Rectangle(width, height);
				break;
			}
		}

		for (Shape shape : shapeArray) {
			shape.print();
			System.out.println();
		}

	}

}
