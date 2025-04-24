public class Circle extends Point {
    private int radius;
    public Circle(){
        super();
        this.radius = 1;
    }
    public Circle(int x ,int y, String color, int radius){
        super(x, y, color);
        this.radius = radius;

    }

    public Circle(Circle other){
        super(other);
        this.radius = other.radius;

    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public void  scale(int scalefactor){
        this.radius *= scalefactor;
    }
    public String string(){
        return "Radius : " + this.radius +
                "\nX and y : " + getX() + " , " + getY()  + ". Color : " + getColor() ;
    }
    public Circle merge(Circle other){
        double distance = Math.sqrt(Math.pow(this.getX() - this.getY(), 2) + Math.pow(this.getY() - other.getY(),2));

        int newRadius = this.radius + (int) distance;

        return new Circle(other.getX(),other.getY(),other.getColor(), newRadius);
    }

}
