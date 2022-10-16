package week3.day2;

import org.openqa.selenium.NoSuchElementException;

public interface HousePlan {
	int length = 40;
	
	/**
	 * This is a house that build up in 30X40 with compuound walls
	 * This should have a Hall for 15X15, followed by kitchen for
	 * 15X8 and a Bedroom for 20X24. A covered car parking should
	 * be given as part of this.
	 * @param houseName - Please provide a name for the house
	 * @author Balaji
	 * @exception {@link NoSuchElementException}
	 */
	public void buildGroundFloor(String houseName);
}
