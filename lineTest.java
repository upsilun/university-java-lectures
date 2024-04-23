class Line {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void drawWithCharacter(char c) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}

public class lineTest {

	public static void main(String[] args) {
		Line line = new Line(5);

		System.out.println("Drawing with asterisks:");
		line.draw();

		System.out.println("Drawing with a different character:");
		line.drawWithCharacter('#');
	}

}
