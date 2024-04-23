
public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this(0, 0);
	}
	
	public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
	}
	
	public int getX() {
		return x;		
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;		
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int[] getXY() {
		return new int[]{x,y};
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    public double distance() {
        return distance(0, 0);
    }

    public static void main(String[] args) {
    	MyPoint point1 = new MyPoint(3, 4);

        System.out.println("Point 1: " + point1); // Output: Point 1: (3, 4)

        int xCoord = point1.getX();
        int yCoord = point1.getY();
        System.out.println("x: " + xCoord + ", y: " + yCoord); // Output: x: 3, y: 4

        point1.setX(5);
        point1.setY(6);
        System.out.println("Point 1 after modification: " + point1); // Output: Point 1 after modification: (5, 6)

        int[] coordinates = point1.getXY();
        System.out.println("Coordinates as array: " + java.util.Arrays.toString(coordinates)); // Output: Coordinates as array: [5, 6]

        double distanceToOrigin = point1.distance();
        MyPoint point2 = new MyPoint(1, 2);
        double distanceToPoint2 = point1.distance(point2);
        System.out.println("Distance to origin: " + distanceToOrigin); // Output: Distance to origin: 5.0
        System.out.println("Distance to point2: " + distanceToPoint2); // Output: Distance to point2: 5.0 (using distance(MyPoint) for efficiency)

    }
}
