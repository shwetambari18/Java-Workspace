package Composition;

public class Furniture {

	private String make;
	private String name;
	private int noOfItems;
	public Furniture(String type, String name, int noOfItems) {
		super();
		this.make = type;
		this.name = name;
		this.noOfItems = noOfItems;
	}
	
	public void keepBooksInShelf()
	{
		System.out.println("Keeping books at shelf");
	}
	
	public String getType() {
		return make;
	}
	public String getName() {
		return name;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	
	
	
}
