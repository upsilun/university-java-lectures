class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
    }
}

public class circleTest {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
        circle1.printCircle();

        System.out.println();

        Circle circle2 = new Circle("brown", 2.5);
        circle2.printCircle();
	}

}
