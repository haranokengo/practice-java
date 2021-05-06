public class PoisonMatango extends Matango {
	int remaining_poison = 5;
	public void poison() {
		System.out.println("毒攻撃ができる");
	}

	public void attack(hero h) {
		super.attack(h);
		if (remaining_poison > 0) {
			System.out.println("毒の胞子をばら撒いた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.remaining_poison--;
		}
	}
}