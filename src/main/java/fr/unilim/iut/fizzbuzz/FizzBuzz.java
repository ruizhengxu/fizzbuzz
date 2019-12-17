package fr.unilim.iut.fizzbuzz;

public class FizzBuzz {

	FizzBuzzBangHandler simpleCasehandler;
	
	public FizzBuzz() {
		this.simpleCasehandler = new SimpleCaseHandler();
		FizzBuzzBangHandler fizzHandler = new FizzHandler();
		simpleCasehandler.setNext(fizzHandler);
		FizzBuzzBangHandler buzzHandler = new BuzzHandler();
		fizzHandler.setNext(buzzHandler);
		FizzBuzzBangHandler bangHandler = new BangHandler();
		buzzHandler.setNext(bangHandler);
	}
	
	public String donnerLaReponsePour(Integer nombre) {

		String str = "";
		
		str = simpleCasehandler.handle(nombre, str);
		
		return str;
	
	}

}
