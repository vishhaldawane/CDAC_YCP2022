
public class Test {
	public static void main(String[] args) {
		
		System.out.println("main invoked...");
		
		
		Point2D p2d = new Point2D(10,20);
		p2d.showPoint();
		
		System.out.println("-----------");
		
		Point3D p3d = new Point3D(50,60,70);
		p3d.showPoint();
		
		System.out.println("Main over...");
	}
}

// . .

class Point2D // 2 dimensions ie x and y
{
	//DATA section  //bugs
	private int x;
	private int y;
	
	
	public Point2D(int x, int y) { //invoked only once
		super();				//during object creation
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() { // 1st type
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}

	public int getX() { //4th type
		return x;
	}

	public void setX(int x) { //2nd type
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}	
}

/*-----------3 dimensions  ------copy paste---*/
// . . .

class Point3D // 3 dimensions ie x y and z
{
	//DATA section
	private int x;
	private int y;
	
	private int z; //NEW
	
	public Point3D(int x, int y, int z) { //invoked only once
		super();				//during object creation
		this.x = x;
		this.y = y;
		this.z = z; //NEW
	}
	
	public void showPoint() { // 1st type
		System.out.println("x : "+x);
		System.out.println("y : "+y);

		System.out.println("z : "+z); //NEW

	}

	public int getX() { //4th type
		return x;
	}

	public void setX(int x) { //2nd type
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
	
}

/*
 
  		Why Inhertiance
  		
  		
  		
 
 */
