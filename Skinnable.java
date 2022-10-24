
public interface Skinnable {
	
	// 色
	public enum Color{
		BLACK,
		RED,
		GREEN,
		BLUE,
		LEOPARD
	}

	// 色変更
	public void changeSkin(Skinnable.Color col);
}
