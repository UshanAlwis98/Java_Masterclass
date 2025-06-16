public class Point {
    private int x;
    private int y;

    // No-arg constructor
    public Point() {
        // default 0,0
    }

    // Constructor with parameters
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance from (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Distance from another Point object
    public double distance(Point another) {
        return Math.sqrt((another.x - this.x) * (another.x - this.x) +
                (another.y - this.y) * (another.y - this.y));
    }

    // Distance from (x, y) coordinates
    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y));
    }
}
