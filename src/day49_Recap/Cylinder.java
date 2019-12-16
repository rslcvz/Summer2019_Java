package day49_Recap;


public class Cylinder extends Shape{
    
    double radius;
    double height;
    final double PI = 3.14;
    double diameter;
    
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        diameter = radius*2;
    }
    
    @Override
    protected void Area() {
        double Area = (PI * diameter * radius) + (height * PI * diameter);
        System.out.println("Area of the cylinder is " + Area);
    }
    
    @Override
    protected void perimeter() {
        // 2 ( pi * D + h)
        double perimeter = 2* (PI * diameter + height);
        System.out.println("perimeter of the cylinder is "+perimeter);    
    }
    
    @Override
    protected void capacity() {
        double capacity = (3.14 * radius * radius * height);
        System.out.println("Capacity of the cylinder is "+capacity);
    }
    
    
    
    
}
