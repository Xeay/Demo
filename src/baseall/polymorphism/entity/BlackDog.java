package baseall.polymorphism.entity;

import entity.animal.Dog;

/**
 * 
 * ºÚ¹·
 * @author q4518
 *
 */
public class BlackDog extends Dog {
	//Ãû³Æ
	private String blackDogName;
	//Ê³Îï
	protected String blackDogFood;
	//Ã«·¢
	public String blackDogHair;
	public BlackDog() {
		this.blackDogName = "ºÚ¹·";
		this.blackDogFood = "ºÚ¹·¹·Á¸";
		this.blackDogHair = "ºÚÉ«¹·Ã«";
	}
	@Override
	public void eatFood() {
		System.out.println(this.blackDogName + "³Ô" + this.blackDogFood);
	}
}
