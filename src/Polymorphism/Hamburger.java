package Polymorphism;

public class Hamburger {
	
	private String breadRollType;
	private String meat;
	private String addition1;
	private String addition2;
	private String addition3;
	private String addition4;
	private double basePrice;
	public double getBasePrice() {
		return basePrice;
	}

	public Hamburger(String breadRollType, String meat, String addition1,
			String addition2, String addition3, String addition4) {
		super();
		this.breadRollType = breadRollType;
		this.meat = meat;
		this.addition1 = addition1;
		this.addition2 = addition2;
		this.addition3 = addition3;
		this.addition4 = addition4;
		this.basePrice = 50;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public String getAddition1() {
		return addition1;
	}

	public String getAddition2() {
		return addition2;
	}

	public String getAddition3() {
		return addition3;
	}

	public String getAddition4() {
		return addition4;
	}
	
	public double getTotalPrice()
	{
		double total=this.basePrice;
		System.out.println("Base price: " + total);
		if(addition1.toLowerCase() == "chips")
			total += 30;
		if(addition2.toLowerCase() == "drinks")
			total += 20;
		if(addition3.toLowerCase() == "cheese")
			total += 50;
		if(addition4.toLowerCase() == "mayo")
			total += 10;
		
		return total;
	}
	
	public String  additionals()
	{
		String additions="";
		if(getAddition1() != "" )
			additions += getAddition1() + " "+ "Price: 30 " ;
		if(getAddition2() != "" )
			additions += getAddition2() + " "+ "Price: 20 " ;
		if(getAddition3() != "" )
			additions += getAddition3() + " "+ "Price: 50 " ;
		if(getAddition4() != "" )
			additions += getAddition4() + " "+ "Price: 10 " ;
		return additions;
	}

}


class HealthyBurger extends Hamburger
{
	private String addition5;
	private String addition6;
	public HealthyBurger( String meat, String addition1,
			String addition2, String addition3, String addition4,
			String addition5, String addition6) {
		
		super("Brown Rye", meat, addition1, addition2, addition3, addition4);
		this.addition5 = addition5;
		this.addition6 = addition6;
	}
	public String getAddition5() {
		return addition5;
	}
	public String getAddition6() {
		return addition6;
	}
	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		double total=super.getTotalPrice();
		if(addition5.toLowerCase() == "olives" )
			total += 15;
		if(addition6.toLowerCase()== "cookies")
			total += 35;
		return total;
	}
	@Override
	public String additionals() {
		// TODO Auto-generated method stub
		String additions="";
		if(getAddition5() != "" )
			additions += getAddition5() + " "+ "Price: 15 " ;
		if(getAddition6() != "" )
			additions += getAddition6() + " "+ "Price: 35 " ;
		
		return super.additionals() + additions;
	}
	
	
	
}

class DeluxeBurger extends Hamburger
{
	
	public DeluxeBurger(String breadRollType, String meat) {
		super(breadRollType, meat, "Chips", "Drinks","","");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return  super.getTotalPrice();
	}
	
	
}