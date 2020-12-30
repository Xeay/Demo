package baseall.polymorphism.entity;

import entity.animal.Dog;

/**
 * 
 * °×¹·
 * @author q4518
 *
 */
public class WhiteDog extends Dog {
	//Ãû³Æ
	private String whiteDogName;
	//Ê³Îï
	protected String whiteDogFood;
	//Ã«·¢
	public String whiteDogHair;
	public WhiteDog() {
		this.whiteDogName = "°×¹·";
		this.whiteDogFood = "°×¹·¹·Á¸";
		this.whiteDogHair = "°×É«¹·Ã«";
	}
	@Override
	public void eatFood() {
		System.out.println(this.whiteDogName + "³Ô" + this.whiteDogFood);
	}
}
