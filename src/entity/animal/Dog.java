package entity.animal;

import entity.genus.Canis;

/**
 * 
 * ¹·
 * @author q4518
 *
 */
public class Dog extends Canis {
	//Ãû³Æ
	private String dogName;
	//Ê³Îï
	protected String dogFood;
	//Ã«·¢
	public String dogHair;
	public Dog() {
		this.dogName = "¹·";
		this.dogFood = "¹·Á¸";
		this.dogHair = "¹·Ã«";
	}
	public void eatFood() {
		System.out.println(this.dogName + "³Ô" + this.dogFood);
	}
	
}
