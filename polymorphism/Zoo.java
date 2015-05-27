package polymorphism;

public class Zoo {

	public static void main(String[] args) {
	
		Giraffe gif = new Giraffe(); 
		gif.setName("Jim");
		gif.setWeight(100);
		gif.setFoodColor("green");
		
		System.out.println(gif.getName() +" weighs "+ 
							gif.getWeight()+" he eats "+gif.getFoodColor() 
							+" food.");
	}
}
