package cse360assignment02;

public class AddingMachine {
  private int total;
  
  /**
  * Sole constructor - initializes total as 0
  * and initializes history as "0 " 
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
  * This method returns the total after all the operations that
  * are done on it.
  *
  * @return      the running total held by the class
  */
  public int getTotal () {
	  return 0;
  }
  /**
   * This method adds its parameter to the total
   *
   * @param      value to be added
   */
  public void add (int value) {
  }
  /**
   * This method subtracts its parameter to the total
   *
   * @param      value to be subtracted
   */
  public void subtract (int value) {
  }
  
  /**
   * This method returns a history of transactions
   * that occurred and returns it as a String
   *
   * @return      transaction history
   */
  public String toString () {
    return ""; 
  }
  
  /**
   * This method clears our "memory"
   * which is the total and the transaction history
   */

  public void clear() {
  }
}