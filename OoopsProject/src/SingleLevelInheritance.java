
public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Point2D p2d = new Point2D(45,55);
		p2d.showPoint();
		
		System.out.println("-----------");
		
		Point3D p3d = new Point3D(40,23,45);
		p3d.showPoint();
		
		System.out.println("-----------");
		
		ColoredPoint3D colp3d = new ColoredPoint3D(12,34,87,"blue");
		colp3d.showPoint();
		
		System.out.println("-----------");
		
	}
}

class Point2D{
	private int x;
	private int y;
	Point2D(int x,int y){
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
	}
}

class Point3D extends Point2D{
	private int z;
	Point3D(int x, int y, int z){
		super(x,y);
		this.z =  z;
	}
	void showPoint() {
		super.showPoint();
		System.out.println("z: "+z);
	}
}

class ColoredPoint3D extends Point3D{
	private String color;
	ColoredPoint3D(int x, int y, int z, String color){
		super(x,y,z);
		this.color = color;
	}
	void showPoint() {
		super.showPoint();
		System.out.println("color: "+color);
	}
}
