package entity.animal;

import entity.genus.Canis;

/**
 * 
 * ��
 * @author q4518
 *
 */
public class Dog extends Canis {
	//����
	private String dogName;
	//ʳ��
	protected String dogFood;
	//ë��
	public String dogHair;
	public Dog() {
		this.dogName = "��";
		this.dogFood = "����";
		this.dogHair = "��ë";
	}
	public void eatFood() {
		System.out.println(this.dogName + "��" + this.dogFood);
	}
	
}
