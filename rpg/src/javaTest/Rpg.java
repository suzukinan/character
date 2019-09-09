package javaTest;

public class Rpg {

	public static void main(String[] args) {

//		キャラクターを新規作成
		Character a1 = new Character();
		a1.name = "でんきネズミ";
		a1.hp = 100;
		a1.mp = 0;
		a1.attack = 40;
		a1.defence = 50;
		a1.speed = 30;

//		キャラクターを新規作成
		Character b1 = new Character();
		b1.name = "みずネズミ";
		b1.hp = 300;
		b1.mp = 200;
		b1.attack = 80;
		b1.defence = 70;
		b1.speed = 60;


//		Characterクラスで作成したメソッドを呼び出す
		a1.introduce();
		a1.strength();

//		見やすくするため空行を入れる
		System.out.println("");

//		Characterクラスで作成したメソッドを呼び出す
		b1.introduce();
		b1.strength();
	}

}
