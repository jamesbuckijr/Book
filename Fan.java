public class Fan {
    
    public static void main( String[] args) {
        System.out.println("BEGIN TEST");
        Fan fan1 = new Fan(2,5,"Red");
        System.out.println(fan1.toString());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("END TEST");
    }
    
    //FAN SPEEDS CONSTANTS
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    
    //STATE DATA FIELDS
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    
    
    //GET AND SET METHODS
    
    //GET SET SPEED
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    
    //GET SET ON
    public boolean getOn() {
        return on;
    }
    public void setOn(boolean newOn) {
        on = newOn;
    }
    
    //GET SET RADIUS
    public double getRadius() {
        return radius;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    //GET SET COLOR
    public String getColor() {
        return color;
    }
    public void setColor( String newColor) {
        color = newColor;
    }
    
    public String toString() {
        if (on == true) {
            String isit = (on == true) ? "on" : "off" ; 
            String output = "The " + color + " fan is " + isit + ", speed:" + speed + " radius:" + radius + ".";
            return output;
        }
        else {
            String output = "The fan is off, radius:" + radius + " and color:" + color + ".";
            return output;
        }
    }
    
    //CONSTRUCTORS
    public Fan() {}
    public Fan(int newSpeed, double newRadius, String newColor) {
        setSpeed(newSpeed);
        setRadius(newRadius);
        setColor(newColor);
        on = true;
    }
}