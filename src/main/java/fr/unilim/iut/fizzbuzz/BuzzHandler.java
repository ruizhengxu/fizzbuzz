package fr.unilim.iut.fizzbuzz;

public class BuzzHandler extends FizzBuzzBangHandler {

	@Override
	public String handle(Integer nombre, String str) {
		
		if (nombre % 5 == 0) {
			str += "buzz";
		}
		
		if (nombre % 5 != 0 || nombre % 7 == 0) {
			str = super.handle(nombre, str);
		}
		
		return str;
	}
}
