public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;
	
	//default constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
	//retrieve radius 

    public double getRadius() {
        return radius;
    }
	//set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
//calculate area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
//calculate perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
//compare objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return Double.compare(this.radius, other.radius) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }
}
