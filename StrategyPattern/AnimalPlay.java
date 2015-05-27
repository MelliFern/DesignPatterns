/*
 	https://www.youtube.com/watch?v=-NCgRD9-C6o&list=PLF206E906175C7E07&index=3
 */
package StrategyPattern;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: "+ sparky.tryToFly()); 
		System.out.println("Bird: "+ tweety.tryToFly());

	}

}
