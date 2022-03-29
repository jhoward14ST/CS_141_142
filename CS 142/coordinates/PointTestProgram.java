package coordinates;

public class PointTestProgram {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        intro();
        Point p1    = new Point();
        Point p2    = new Point(3, 4);

        p1.x = 5;
        p1.y = 8;
        System.out.println(p1);
        p1.move(-1, -2);
        System.out.println(p1);
    }
}

