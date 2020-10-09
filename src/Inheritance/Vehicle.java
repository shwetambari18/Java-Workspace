package Inheritance;

public class Vehicle {

	private int noOfWheels;
	private String engineType;
	private int changingGears;
	private int speed;
	
	
	
	
	public Vehicle(int noOfWheels, String engineType, int changingGears,
			int speed) {
		super();
		this.noOfWheels = noOfWheels;
		this.engineType = engineType;
		this.changingGears = changingGears;
		this.speed = speed;
	}


	public void movingSpeed(int speed)
	{
		this.speed = speed;
		System.out.println("Vehicle is moving with speed :" + speed);
		
	}
	
	
	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getChangingGears() {
		return changingGears;
	}

	public void setChangingGears(int changingGears) {
		this.changingGears = changingGears;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
}
