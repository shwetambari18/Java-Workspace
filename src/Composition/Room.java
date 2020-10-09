package Composition;

public class Room {

	private TV myTv;
	private Furniture myFurniture;
	private Doors mydoors;
	
	public void currentTVShow()
	{
		getMyTv().playChannel();
	}
	
	public void booksInShelf()
	{
		getMyFurniture().keepBooksInShelf();
		
	}
	
	public void openDoor()
	{
		getMydoors().doorClosing(false);
	}
	
	
	public TV getMyTv() {
		return myTv;
	}
	public Furniture getMyFurniture() {
		return myFurniture;
	}
	public Doors getMydoors() {
		return mydoors;
	}
	
	
	
	
	//TV myTv = new TV("HD", "SONY", 32);
	//Doors myDoors = new Doors(2, "wooden", true);
	//Furniture myFurniture = new Furniture("Leather", "Sofa", 2);
	
	//Room livingRoom = new Room();
}
