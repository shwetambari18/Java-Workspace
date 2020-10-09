package Polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++)
		{
			Car car = getRandomCar();
			System.out.println("Car name: " + car.getName() + " Engine start: " + car.startEngine());
		}*/
		
		Hamburger ham1 = new Hamburger("White", "Chicken", "chips", "", "cheese", "");
		System.out.println("Additionals  " + ham1.additionals());
		System.out.println("Total price Ham1 " + ham1.getTotalPrice());
		Hamburger ham2 = new Hamburger("White", "Ham", "", "", "", "Mayo");
		
		System.out.println("Additionals" + ham2.additionals());
		
		System.out.println("Total price Ham2 " + ham2.getTotalPrice());
		
		DeluxeBurger del1 = new DeluxeBurger("Multigrain", "Mutton");
		System.out.println("Additionals " + del1.additionals());
		System.out.println("Total price Del1 " + del1.getTotalPrice());
		
		HealthyBurger hel1 = new HealthyBurger("Chicken", "", "", "Cheese", "Lettuce", "Olives", "Cookies");
		System.out.println("Additionals " + hel1.additionals());
		System.out.println("Total price Del1 " + hel1.getTotalPrice());
		
	}
	
	public static Car getRandomCar()
	{
		int random = (int)(Math.random() * 3) + 1;
		System.out.println(random);
			switch(random)
			{
				case 1:
					return new Vectra(4);
					
				case 2:
					return new Mercedes(3);
					
				case 3:
					return new RangeRover(5);
			}
		
		return null;
	}


}


class Car{
	
	private String name;
	private int cylinders;
	private int wheels;
	private boolean engine;
	
	public Car(String name, int cylinders) {
		super();
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.engine = true;
	}

	public String getName() {
		return name;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public boolean isEngine() {
		return engine;
	}
	
	public String startEngine()
	{
		return "Car Engine starting:";
	}
	
	public void accelerate()
	{
		System.out.println("Increase the speed: ");
	}
	
	public void theBreak()
	{
		System.out.println("Put the break!");
	}
}

class Vectra extends Car{

	public Vectra( int cylinders) {
		super("Vectra", cylinders);
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		return "Vectra engine is starting!";
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
		System.out.println("Vectra is accelerating");
	}

	@Override
	public void theBreak() {
		// TODO Auto-generated method stub
		super.theBreak();
		System.out.println("Vectra is puting break");
	}
	
}

class Mercedes extends Car
{

	public Mercedes( int cylinders) {
		super("Mercedes", cylinders);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		super.startEngine();
		return "Mercedes engine is starting!";
	}

	

	@Override
	public void theBreak() {
		// TODO Auto-generated method stub
		super.theBreak();
		
		System.out.println("Mercedec putting on break!");
	}
}


class RangeRover extends Car{

	public RangeRover( int cylinders) {
		super("Range Rover", cylinders);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}

