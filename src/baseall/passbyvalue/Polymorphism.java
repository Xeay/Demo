package baseall.passbyvalue;

import baseall.polymorphism.entity.BlackDog;
import baseall.polymorphism.entity.WhiteDog;
import entity.animal.Dog;

/**
 * Java��̬
 * ��Ҫ�أ��̳С���д����������ָ���������
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
		//��
		Dog dog = new Dog();
		//�׹�
		WhiteDog whiteDog = new WhiteDog();
		//�ڹ�
		BlackDog blackDog = new BlackDog();
		dog.eatFood();
		whiteDog.eatFood();
		blackDog.eatFood();
	}
	public static void testSecond() {
		//��
		Dog dog0 = new Dog();
		//�׹�
		Dog dog1 = new WhiteDog();
		dog0.eatFood();
		dog1.eatFood();
	}
}