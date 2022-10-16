package week3.day2;

public class MyHouse {
public static void main(String[] args) {
	Land land = new Land();
	land.buildGroundFloor("Estancia");
	land.buildGarden();
	
	// Scope restriction of object
	HousePlan land1 = new Land();
	land1.buildGroundFloor("Estancia");
	land1.buildGarden();
}
}
