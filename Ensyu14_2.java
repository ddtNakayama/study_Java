
public class Ensyu14_2 {

	public static void main(String[] args) {
		// ロボットペット
		RobotPet rPet = new RobotPet("ロボット", "マスター");

		// 自己紹介
		rPet.introduce();

		// スキンを豹柄に変更
		rPet.changeSkin(Skinnable.Color.LEOPARD);
	}
}
