public class MainProgram {
    public static void main(String[] args) {
        //create objwcts
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        //compare circles
        if (circle1.equals(circle2)) {
            System.out.println("circle1 is equal to circle2.");
        } else {
            System.out.println("circle1 is not equal to circle2.");
        }

        //print results
        System.out.println("Circle 1: Radius = " + circle1.getRadius());
        System.out.println("Circle 1 Area: " + circle1.getArea());
        System.out.println("Circle 1 Perimeter: " + circle1.getPerimeter());

        System.out.println("Circle 2: Radius = " + circle2.getRadius());
        System.out.println("Circle 2 Area: " + circle2.getArea());
        System.out.println("Circle 2 Perimeter: " + circle2.getPerimeter());
    }
}
