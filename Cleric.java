import java.util.*;

public class Cleric {
	String name;
	int hp = 50;
	final int Max_Hp = 50;
	int mp = 10;
	final int Max_Mp = 10;

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.Max_Hp;
		System.out.println("HPが最大まで回復した！");
	}

	public void pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天を祈った！");

		// 論理上回復量を乱数を用いて決定する
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.Max_Mp - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
		
	}
}