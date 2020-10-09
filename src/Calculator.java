
public class Calculator {

	private Floor floor;
	private Carpet carpet;
	
	public Calculator(Floor floor,Carpet carpet)
	{
		this.floor = floor;
		this.carpet = carpet; 
	}
	
	public double getTotalCost()
	{
		double cost=0;
		
		cost = this.floor.getArea() * this.carpet.getCost();
		return cost;
	}
}
