
public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer()
	{
		this("Shweta",2345,"shwe@g.co");
	}
	
	public VipCustomer(String name,String email)
	{
		this(name,123,email);
	}
	
	public VipCustomer(String name,double limit,String email)
	{
		this.name = name;
		this.creditLimit = limit;
		this.email = email;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getCreditLimit()
	{
		return this.creditLimit;
	}
	
	public String getEmail()
	{
		return this.email;
	}

}
