import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Box b1=new Box();
		Box b2=new Box();
		System.out.println("Box 1");
		b1.accept();
		System.out.println("Box 2");
		b2.accept();
		System.out.println("Box 1 volume : "+b1.vloume());
		
		System.out.println("Box 2 volume : "+b2.vloume());
		
		

	}

}

class Box
{
	Scanner sc=new Scanner(System.in);
	private float width;
	private float height;
	private float depth;
	
	
	
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

public void accept(){
	System.out.println("Enter width : ");
	this.setWidth(sc.nextFloat());
	System.out.println("Enter Height : ");
	this.setHeight(sc.nextFloat());
	System.out.println("Enter depth : ");
	this.setDepth(sc.nextFloat());
}

	public double vloume()
	{
		return this.width*this.height*this.depth;
	}
}
