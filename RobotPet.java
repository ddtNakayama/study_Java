
public class RobotPet extends Pet implements Skinnable {

	// コンストラクタ
	public RobotPet(String name, String masterName) {
		// スーパークラスのコンストラクタ
		super(name, masterName);
	}

	// 自己紹介
	public void introduce() {
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	// 家事をする
	public void work(int sw) {
		switch (sw) {
		case 0:
			System.out.println("掃除します。");
			break;
		case 1:
			System.out.println("洗濯します。");
			break;
		case 2:
			System.out.println("炊事します。");
			break;
		}
	}

	// スキン変更
	public void changeSkin(Skinnable.Color col) {
		System.out.print("スキンを");
		switch (col) {
		case BLACK:
			System.out.print("漆黒");
			break;
		case RED:
			System.out.print("深紅");
			break;
		case GREEN:
			System.out.print("柳葉");
			break;
		case BLUE:
			System.out.print("露草");
			break;
		case LEOPARD:
			System.out.print("豹柄");
			break;
		}
		System.out.println("に変更しました。");

	}
}
