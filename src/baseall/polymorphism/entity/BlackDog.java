package baseall.polymorphism.entity;

import entity.animal.Dog;

/**
 * 
 * �ڹ�
 * @author q4518
 *
 */
public class BlackDog extends Dog {
	//����
	private String blackDogName;
	//ʳ��
	protected String blackDogFood;
	//ë��
	public String blackDogHair;
	public BlackDog() {
		this.blackDogName = "�ڹ�";
		this.blackDogFood = "�ڹ�����";
		this.blackDogHair = "��ɫ��ë";
	}
	@Override
	public void eatFood() {
		System.out.println(this.blackDogName + "��" + this.blackDogFood);
	}
}
