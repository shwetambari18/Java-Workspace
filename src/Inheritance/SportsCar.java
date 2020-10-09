package Inheritance;

public class SportsCar extends Car {

	private int fastestSpeed;
	
	
	
	public SportsCar(int noOfWheels, String engineType, int changingGears,
			int speed, int passangerLimit, String modelType,int fastestSpeed) {
		super(noOfWheels, engineType, changingGears, speed, passangerLimit, modelType);
		// TODO Auto-generated constructor stub
		
		this.fastestSpeed = fastestSpeed;
	}

	@Override
	public void gearsChanging(int gear) {
		// TODO Auto-generated method stub
		super.gearsChanging(gear);
		System.out.println("Gear no changing in sports car: " + gear);
	}

	public int getFastestSpeed() {
		return fastestSpeed;
	}

	public void setFastestSpeed(int fastestSpeed) {
		this.fastestSpeed = fastestSpeed;
	}
	
	
	
}
