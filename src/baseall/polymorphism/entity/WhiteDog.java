package baseall.polymorphism.entity;

import entity.animal.Dog;

/**
 * 
 * �׹�
 * @author q4518
 *
 */
public class WhiteDog extends Dog {
	//����
	private String whiteDogName;
	//ʳ��
	protected String whiteDogFood;
	//ë��
	public String whiteDogHair;
	public WhiteDog() {
		this.whiteDogName = "�׹�";
		this.whiteDogFood = "�׹�����";
		this.whiteDogHair = "��ɫ��ë";
	}
	@Override
	public void eatFood() {
		System.out.println(this.whiteDogName + "��" + this.whiteDogFood);
	}
}
