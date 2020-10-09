
public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
	}
	
	public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets)
	{
		int bucketCount=0;
		double area=0;
		double areaWithExtraBucket=0;
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
			return -1;
		
		areaWithExtraBucket = extraBuckets * areaPerBucket;
		
		area = width * height;
		double remainingArea = area - areaWithExtraBucket;
		if(remainingArea <=0)
		{
			bucketCount = 0;
		}
		else
		{
			bucketCount = (int) Math.ceil(remainingArea/areaPerBucket);
		}
		return bucketCount;
	}
	
	
	public static int getBucketCount(double width,double height,double areaPerBucket)
	{
		int bucketCount=0;
		double area=0;
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 )
			return -1;
		area= width *  height;
		bucketCount = (int) Math.ceil(area/areaPerBucket);
		return bucketCount;
	}
	
	public static int getBucketCount(double area,double areaPerBucket)
	{
		int bucketCount=0;
		
		if(area <=0 || areaPerBucket <= 0 )
			return -1;
		
		bucketCount = (int) Math.ceil(area/areaPerBucket);
		return bucketCount;
		
	}
}
