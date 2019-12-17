package fr.unilim.iut.fizzbuzz;

public class BangHandler extends FizzBuzzBangHandler {

	@Override
	public String handle(Integer nombre, String str) {
		
		if (nombre % 7 == 0) {
			str += "bang";
		}
		
		if (nombre % 7 != 0) {
			str = super.handle(nombre, str);
		}
		
		return str;
	}
}
