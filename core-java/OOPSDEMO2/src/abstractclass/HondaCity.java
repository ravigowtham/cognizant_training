package abstractclass;

public class HondaCity extends Car {
	
	@Override
	void drive() {
		System.out.println("Honda city is driven by power steering");
	}

	@Override
	void stop() {
		System.out.println("Honda city is stopped by power break");
	}
}


