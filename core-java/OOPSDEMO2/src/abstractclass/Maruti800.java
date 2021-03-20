package abstractclass;

public class Maruti800 extends Car {
	
	@Override
	void drive() {
		System.out.println("Maruti 800 is driven by normal steering");
	}

	@Override
	void stop() {
		System.out.println("Maruti 800 is stopped by normal break");
	}
}
