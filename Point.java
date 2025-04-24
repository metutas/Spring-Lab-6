public class Point {
    private int x;
    private int y;
    private String color;

    public Point(){
        this.x = 0;
        this.y = 0;
        this.color = "black";
    }


    public Point(int x ,int y, String color){
        this.x = x;
        this.y = y;
        this.color = color;

    }
    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
        this.color =other. color;
        
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "\n X: " + this.x + "\n Y: " + this.y + "\n Color: " + this.color;
    }
    public double area(){
        return 0.0;
    }
    public void translate (int dx, int dy){
        this.x +=  dx;
        this.y +=  + dy;
    }
    public boolean equals(Point other){
        return this.x == other.x && this.y == other.y && this.color.equals(other.color);
    }

    
    
    





}
