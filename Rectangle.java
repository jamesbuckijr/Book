public class Rectangle {
    public static void main(String[] args) {
        
    }
    
    private double width = 1;
    private double height = 1;
    private String color = "white";
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
    public double getArea() {}
    public double getPerometer() {}
}