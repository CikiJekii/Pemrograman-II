package modul5.PRAK501_2510817310016_AHMADMUZAKKIKHAIRA;

public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}