package cse360assignment02;
/*
 * 
public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  public int getTotal () {
    return 0;
  }
  
  public void add (int value) {
  }

  public void subtract (int value) {
  }

  public String toString () {
    return "";
  }

  public void clear() {
  }
}
*/
public class AddingMachine {

	private int total;
	private String history = "0";  //set history string
	 
	  public AddingMachine () {
		  total = 0;  
	  }
	  
	  public int getTotal () {
	    return total;
	  }
	  
	  public void add (int value) {
		  total = total + value;
		  history = history + " + " + value;	//add onto history
	  }

	  public void subtract (int value) {
		  total = total - value;
		  history = history + " - " + value;
	  }

	  public String toString () {
	    return history;
	  }

	  public void clear() {
		  total = 0;
		  history = "0";		//reset values
		  
	  }
	
	  
}
