package Composition;

public class Doors {

	private int noOfDoors;
	private String type;
	private boolean isOpen;
	
	public Doors(int noOfDoors, String type, boolean isOpen) {
		super();
		this.noOfDoors = noOfDoors;
		this.type = type;
		this.isOpen = isOpen;
	}
	
	public void doorClosing(boolean isClosed)
	{
		System.out.println("Door is closing " + isClosed);
	}
	
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public String getType() {
		return type;
	}
	public boolean isOpen() {
		return isOpen;
	}
	
	
}
