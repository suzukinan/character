package javaTest;

public class Character {

//	インスタンス変数を定義
	public String name;
	public int hp;
	public int mp;
	public int attack;
	public int defence;
	public int speed;


//	インスタンスメソッド作成
	public void introduce() {
		System.out.println("僕の名前は" + name + ",HPは" + hp + ",MPは" + mp + " !！" );
	}

	public void strength() {
		System.out.println("攻撃力:" + attack + ",防御力:" + defence + ",素早さ:" + speed);
	}
}
