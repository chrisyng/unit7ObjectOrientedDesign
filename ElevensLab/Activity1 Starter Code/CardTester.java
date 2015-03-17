/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("Jack", "Clubs", 11);
		Card card2 = new Card("Jack", "Clubs", 11);
		Card card3 = new Card("Ace", "Hearts", 1);
		if (card1.matches(card3))
		{
		    System.out.println("fail");
		}
		else
		{
		    System.out.println("yay");
		  }
		if (card1.matches(card2))
		{
		    System.out.println("cards match");
		}
		card3.toString();
	}
}
