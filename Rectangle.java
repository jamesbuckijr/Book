public class Rectangle {
    public static void main(String[] args) {
        System.out.println("TEST START");
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2.5, 3.5, "Red");
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle2.getHeight());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getColor());
        System.out.println("TEST END");
    }
    
    private double width = 1;
    private double height = 1;
    private static String color = "white";
    public double getWidth() {
        return width;
    }
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String newColor) {
        color = newColor;
    }    
    public Rectangle() {
    }
    public Rectangle(double userRadius, double userHeight, String userColor) {
        setHeight(userRadius);
        setWidth(userHeight);
        setColor(userColor);
    }
    public double getArea() {
        return (width * height);
    }
    public double getPerimeter() {
        return ((height * 2) + (width * 2));
    }
}