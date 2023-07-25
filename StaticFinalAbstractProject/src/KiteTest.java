
public class KiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Kite kite1 = new Kite("Salil","Green",50);
		kite1.showKite();
		
		Kite kite2 = new Kite("Sujal","Blue",60);
		kite2.showKite();
		
		Kite kite3 = new Kite("Roshan","Yellow",70);
		kite2.showKite();
		
		Kite kite4 = new Kite("Shruti","Black",30);
		kite2.showKite();
		
		Kite kite5 = new Kite("Mitali","Green",45);
		kite2.showKite();
		Kite.showKiteCount();
	}

}

class Kite{
	private String owner;
	private String color;
	private int length;
	
	private static int kiteCount;
	
	public static void showKiteCount() {
		System.out.println("Total kites in the sky : "+kiteCount);
	}

	public Kite(String owner, String color, int length) {
		super();
		System.out.println("Kite is created...");
		this.owner = owner;
		this.color = color;
		this.length = length;
		kiteCount++;
	}
	
	void showKite() {
		System.out.println("Kite Owner : "+owner);
		System.out.println("Kite Color : "+color);
		System.out.println("Kite Length : "+length);
		System.out.println("Kite Count : "+Kite.kiteCount);
		System.out.println("---------------");
		
	}

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}
	
	
}