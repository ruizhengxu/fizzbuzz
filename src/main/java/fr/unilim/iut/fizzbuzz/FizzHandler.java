package fr.unilim.iut.fizzbuzz;

public class FizzHandler extends FizzBuzzBangHandler {

	@Override
	public String handle(Integer nombre, String str) {
		
		if (nombre % 3 == 0) {
			str += "fizz";
		}
		
		if (nombre % 3 != 0 || nombre % 5 == 0 || nombre % 7 == 0) {
			str = super.handle(nombre, str);
		}
		
		return str;
	}
}
