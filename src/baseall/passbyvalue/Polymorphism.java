package baseall.passbyvalue;

import baseall.polymorphism.entity.BlackDog;
import baseall.polymorphism.entity.WhiteDog;
import entity.animal.Dog;

/**
 * Java多态
 * 三要素：继承、重写、父类引用指向子类对象
 * @author q4518
 *
 */
public class Polymorphism {
	public static void main(String[] args) {
		testFirst();
		System.out.println("---------------------");
		testSecond();
	}
	public static void testFirst() {
		//狗
		Dog dog = new Dog();
		//白狗
		WhiteDog whiteDog = new WhiteDog();
		//黑狗
		BlackDog blackDog = new BlackDog();
		dog.eatFood();
		whiteDog.eatFood();
		blackDog.eatFood();
	}
	public static void testSecond() {
		//狗
		Dog dog0 = new Dog();
		//白狗
		Dog dog1 = new WhiteDog();
		dog0.eatFood();
		dog1.eatFood();
	}
}