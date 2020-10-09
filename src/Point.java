
public class Point {

	private int x;
	private int y;
	
	public Point()
	{
		
	}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public double distance()
	{
		double distance=0;
		distance = Math.sqrt(((0-getX()))*(0-getX()) + ((0-getY())*(0-getY())));
		
		return distance;
	}
	
	public double distance(int x, int y)
	{
		double distance=0;
		distance = Math.sqrt(((x-getX()))*(x-getX()) + ((y-getY())*(y-getY())));
		
		return distance;
	}
	
	public double distance(Point point)
	{
		double distance=0;
		distance = Math.sqrt(((point.getX()-getX()))*(point.getX()-getX()) + ((point.getY()-getY())*(point.getY()-getY())));
		
		return distance;
	}
}
