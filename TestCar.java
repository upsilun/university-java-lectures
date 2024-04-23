class Car {
	private int speed;
	private String type;
	
	public int getSpeed() {
		return speed;
	}
	
	public String getType() {
		return type;
	}
	
	public void setSpeed(int sp) {
		speed = sp;
	}
	
	public void setType(String ty) {
		type = ty;
	}
}
public class TestCar {

	static Car car1 = new Car();
	public static void main(String[] args) {
		car1.setSpeed(240);
		car1.setType("KIA");
		System.out.println(car1.getSpeed());
		System.out.println(car1.getType());
	}

}
