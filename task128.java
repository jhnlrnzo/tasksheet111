interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
}

abstract class AbstractShape implements Shape{
    String color;
    double length;
    double width;
    public AbstractShape(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }
}
class Circle extends AbstractShape{
    double radius;

    public Circle(String color, double radius){
        super(color,radius, 0);
        this.radius = radius;
    }


    public double calculateArea(){
        return (Math.PI * radius * radius);
    }

    public double calculatePerimeter(){
        return (2 * Math.PI * radius);
    }
}
class Rectangle extends AbstractShape{
    public Rectangle(String color, double length, double width){
        super(color, length,width);
    }
    
    public double calculateArea(){
        return (length * width);
    }

    public double calculatePerimeter(){
        return (2*(length+width));
    }
}

public class task128{
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}