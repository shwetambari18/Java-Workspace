package Composition;

public class TV {

	private String model;
	private String manufacturer;
	private int size;
	
	
	
	public TV(String model, String manufacturer, int size) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
	}
	
	public void playChannel()
	{
		System.out.println("TV is currently playing show: ");
	}
	public String getModel() {
		return model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSize() {
		return size;
	}
	 
	
}
