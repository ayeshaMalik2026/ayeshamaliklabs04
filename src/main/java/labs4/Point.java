package labs4;

/**
 * @author ayesh
 */
public final class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {
        Point p = new Point(5, 10);
        System.out.println("Point X: " + p.getX());
        System.out.println("Point Y: " + p.getY());
    }
}