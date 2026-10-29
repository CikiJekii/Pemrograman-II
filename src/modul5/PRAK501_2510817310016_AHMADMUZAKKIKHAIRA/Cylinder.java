package modul5.PRAK501_2510817310016_AHMADMUZAKKIKHAIRA;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double jariJari, double tinggi) {
        super("Cylinder");
        this.radius = jariJari;
        this.height = tinggi;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString()
                + " of radius " + radius
                + " and height " + height;
    }
}