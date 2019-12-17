package fr.unilim.iut.fizzbuzz;

public abstract class FizzBuzzBangHandler {

	public FizzBuzzBangHandler next;
	
	public String handle(Integer nombre, String str) {
		
		if (next != null) {
			str = next.handle(nombre, str);
		}
		
		return str;
	}
	
	public void setNext(FizzBuzzBangHandler next) {
		this.next = next;
	}
}
