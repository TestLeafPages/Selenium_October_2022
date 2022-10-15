package week3.day1;

public class Dhinesh extends Father{
	public void ownApartment() {
		System.out.println("Apartment -> Dhinesh");
	}

	public void ownSuperCar() {
		System.out.println("Super Car -> BMW 320D");
	}
	
	public void layFlooring() {
		System.out.println("Marbles flooring");
	}
	
	public void getParentFlooring() {
		super.layFlooring();
	}
}
