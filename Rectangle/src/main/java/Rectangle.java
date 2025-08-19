package main.java;

public class Rectangle {
    private double width = 1.00;
    private double height = 1.00;

    public Rectangle() {
        // Default constructor initializes width and height to 1.00
        width = 1.00;
        height = 1.00;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return (int)(width * height);
    }

    public int getPerimeter(){
        return (int)(2 * (width + height));
    }

    public String printRectangle(String objectName){
        return "Rectangle: " + objectName + "\n" +
               "Width: " + width + "\n" +
               "Height: " + height + "\n" +
               "Area: " + getArea() + "\n" +
               "Perimeter: " + getPerimeter();
    }
}
