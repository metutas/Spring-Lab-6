public class Driver {
    public static void TranslateAll(Circle[] circles, int dx, int dy){
        for (Circle circle: circles) {
            if (circle != null){
                circle.translate(dx, dy);
            }
        }
    }
    public static void main(String [] args){
        // Create Circle object
        Circle c1 = new Circle(1,2,"red",5);
        Circle c2 = new Circle(3,4,"blue",10);
        Circle c3 = new Circle(0,0,"green",3);

        //Create circle array
        Circle[] circles = {c1,c2,c3};

        // Original State
        System.out.println("First");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        System.out.println("\n After");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        Circle c4 = c1.merge(c2);
        System.out.println("\n New Circle after merge");
        System.out.println(c4);


    }
}
