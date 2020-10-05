package cse360assignment02;
// Name: Nicholas Ngo
// repo: https://github.com/nqngo-asu/Assignment02
// Description: This class does addition and subtraction to a 
// total and returns it and any changes amde to it
public class AddingMachine {
	  private int total;
	  private String history;
	  
	  /**
	  * Sole constructor - initializes total as 0
	  * and initializes history as "0 " 
	  */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0 ";
	  }
	  /**
	  * This method returns the total after all the operations that
	  * are done on it.
	  *
	  * @return      the running total held by the class
	  */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * This method adds its parameter to the total
	   *
	   * @param      value to be added
	   */
	  public void add (int value) {
		  total += value; //adds value to total
		  history = history + "+ " + value  + " "; //adds to transaction history
	  }
	  /**
	   * This method subtracts its parameter to the total
	   *
	   * @param      value to be subtracted
	   */
	  public void subtract (int value) {
		  total -= value; //adds value to total
		  history = history + "- " + value  + " "; //subtracts transaction history
	  }
	  
	  /**
	   * This method returns a history of transactions
	   * that occurred and returns it as a String
	   *
	   * @return      transaction history
	   */
	  public String toString () {
	    return history; //returns transaction history
	  }
	  
	  /**
	   * This method clears our "memory"
	   * which is the total and the transaction history
	   */

	  public void clear() {
		  total = 0; //reset total
		  history = "0 "; //reset memory
	  }
	}