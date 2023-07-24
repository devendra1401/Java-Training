
public class TigerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger tiger = new Tiger();
		tiger.jump();
		tiger.jump(10);
		tiger.jump(15,20);
		tiger.jump(13.8f);
		tiger.jump(12,21.3f);
		tiger.jump(16.8f,14);
		tiger.jump(9.4f,17.4f);
	}

}

class Tiger{
	void jump() {
		System.out.println("Tiger is jumping..");
	}
	void jump(int length) {
		System.out.println("Tiger: jump(int): is jumping.."+length+" feet length");
	}
	void jump(int length, int height) {
		System.out.println("Tiger: jump(int, int): is jumping.."+length+" feet length"+height+" feet height");
	}
	void jump(float length) {
		System.out.println("Tiger: jump(float): is jumping.."+length+" feet length");
	}
	void jump(int length, float height) {
		System.out.println("Tiger: jump(int, float): is jumping.."+length+" feet length"+height+" feet height");
	}
	void jump(float length, int height) {
		System.out.println("Tiger: jump(float, int): is jumping.."+length+" feet length"+height+" feet height");
	}
	void jump(float length, float height) {
		System.out.println("Tiger: jump(float, float): is jumping.."+length+" feet length"+height+" feet height");
	}
}
