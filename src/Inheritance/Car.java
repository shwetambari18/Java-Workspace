package Inheritance;

public class Car extends Vehicle{

	private int passangerLimit;
	private String modelType;
	
	
	
	public Car(int noOfWheels, String engineType, int changingGears, int speed,int passangerLimit,String modelType) {
		super(noOfWheels, engineType, changingGears, speed);
		// TODO Auto-generated constructor stub
		this.passangerLimit= passangerLimit;
		this.modelType = modelType;
		
	}

	public int getPassangerLimit() {
		return passangerLimit;
	}

	public void setPassangerLimit(int passangerLimit) {
		this.passangerLimit = passangerLimit;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
	
	@Override
	public void movingSpeed(int speed) {
		// TODO Auto-generated method stub
		super.movingSpeed(speed);
		System.out.println("Car is moving with speed :" + speed);
	}
	
	public void gearsChanging(int gear)
	{
		System.out.println("Car gear no changing : " + gear);
	}
	
	
	
}
