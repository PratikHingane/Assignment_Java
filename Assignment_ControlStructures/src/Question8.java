import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		try
		{    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Box 1 dimensions height,depth,width : ");
		Boxx b1=new Boxx(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		System.out.println("Enter Box 2 dimensions height,depth,width : ");
		Boxx b2=new Boxx(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		
		System.out.println("Box 1 volume : "+b1.vloume());
		
		System.out.println("Box 2 volume : "+b2.vloume());
		
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}

	}

}

class Boxx
{
	Scanner sc=new Scanner(System.in);
	private float width;
	private float height;
	private float depth;
	
	
	
	public Boxx( float width, float height, float depth) {
		
		this.sc = sc;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}



	public float getWidth() {
		return width;
	}



	public void setWidth(float width) {
		this.width = width;
	}



	public float getHeight() {
		return height;
	}



	public void setHeight(float height) {
		this.height = height;
	}



	public float getDepth() {
		return depth;
	}


public void setDepth(float depth) {
		this.depth = depth;
	}



	public double vloume()
	{
		return this.width*this.height*this.depth;
	}
}
