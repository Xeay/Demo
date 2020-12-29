package baseall.polymorphism;

import entity.animal.Dog;

/**
 * Java多态
 * 三要素：继承、重写、父类引用指向子类对象
 * @author q4518
 *
 */
public class Polymorphism {
	public static void main(String[] args) {
		//犬
		Dog dog = new Dog();
		System.out.println(dog);
	}
}