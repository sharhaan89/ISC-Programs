package ISC;

public class Circle extends Plane {
    
    int x2, y2;
    double radius, area;

    Circle(int nx, int ny, int mx, int my) {
        super(nx, ny);
        x2 = mx; 
        y2 = my;
    }
    
    void findRadius() {
        radius = (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))) / 2; 
    }
    
    void findArea() {
        area = Math.PI * radius * radius;
    }
    
    @Override
    void Show() {
        System.out.println("Coordinates:");
        System.out.println(x1+" "+y1);
        System.out.println(x2+" "+y2);
        System.out.println("Radius: "+radius);
        System.out.println("Area: "+area);
    }
    
    public static void main(String args[]) {
        Circle circle = new Circle(0, 1, 6, 1);
        circle.findRadius();
        circle.findArea();
        circle.Show();
    }
}
