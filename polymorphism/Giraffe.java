package polymorphism;

/*
 when a class IS-A more than one thing 
  	Giraffe IS-A Creature
  	Giraffe IS-A Vegetarian
 */
public class Giraffe extends Creature implements Vegetarian{
	private String name;
	private double weight;
	private String foodColor;
	
	public void setName(String newName){name = newName;}
	@Override
	public String getName() {return name;}

	@Override
	public void setWeight(double newWeight) {weight = newWeight;}

	@Override
	public double getWeight() {return weight;}
	@Override
	public String getEat() {
		return "All Greens";
	}
	@Override
	public String getFoodColor() {
		return foodColor;
	}
	@Override
	public void setFoodColor( String color) {
		foodColor = color;
		
	}
}