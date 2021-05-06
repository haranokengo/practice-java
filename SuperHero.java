public class PoisonMatango extends Matango {
	int remaining_poison = 5;
	public void poison() {
		System.out.println("毒攻撃ができる");
	}

	public void attack() {
		super.attack();
		if (remaining_poison == 0) {
			System.out.println("毒の胞子をばら撒いた！");
			h.hp = this.hp - (this.hp * 1/5);
			System.out.println(h.hp + "ポイントのダメージ");
			remaining_poison -= 1;
		}
	}
}