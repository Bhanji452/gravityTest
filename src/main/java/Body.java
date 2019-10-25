public class Body {
    private double diameter;
    private double x;
    private double y;
    private double acceleration;
    private double dir;
    private String label;

    public Body(double diameter, double x, double y, double acceleration, double dir, String label) {
        this.diameter = diameter;
        this.x = x;
        this.y = y;
        this.acceleration = acceleration;
        this.dir = dir;
        this.label = label;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getDir() {
        return dir;
    }

    public void setDir(double dir) {
        this.dir = dir;
    }
}
