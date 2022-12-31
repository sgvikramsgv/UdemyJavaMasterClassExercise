public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        double ans = 0;
        ans = Math.sqrt(((this.x) * (this.x)) + ((this.y) * (this.y)));
        return ans;
    }
    public double distance(int x, int y){
        double ans = 0;
        ans = Math.sqrt(((this.x - x) * (this.x -x)) + ((this.y - y) * (this.y - y)));
        return ans;
    }
    public double distance(Point a){
        double ans = 0;
        ans = Math.sqrt(((this.x - a.x) * (this.x -a.x)) + ((this.y - a.y) * (this.y - a.y)));
        return ans;
    }

}
