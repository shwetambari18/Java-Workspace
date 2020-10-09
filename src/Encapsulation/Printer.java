package Encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean isDuplex;
	
	public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
		super();
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.isDuplex = isDuplex;
	}
	
	public void fillToner(int level)
	{
		if(getTonerLevel() + level <= 100)
		{
			this.tonerLevel  += level;
		}
	}
	
	public void printPages(int pages)
	{
		this.pagesPrinted +=pages;
	}
	
	public int getTonerLevel() {
		return tonerLevel;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	public boolean isDuplex() {
		return isDuplex;
	}
	
	

}
