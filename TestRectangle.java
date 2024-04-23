class Rectangle {
	public int columns;
	public int rows;
	
	public Rectangle(int c, int r) {
		columns = c;
		rows = r;
	}
	
	public void draw() {
		for(int i = 0; i <= rows; i++) {
			for(int j = 0; j <= columns; j++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
	}
}

public class TestRectangle {
	public static void main(System[] args) {
		Rectangle a = new Rectangle(5, 5);
		a.draw();
	}
}
