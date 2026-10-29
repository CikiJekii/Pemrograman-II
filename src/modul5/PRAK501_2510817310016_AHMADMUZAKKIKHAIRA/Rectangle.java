package modul5.PRAK501_2510817310016_AHMADMUZAKKIKHAIRA;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double panjang, double lebar) {
        super("Rectangle");
        this.length = panjang;
        this.width = lebar;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString()
                + " of length " + length
                + " and width " + width;
    }
}