package modul5.PRAK501_2510817310016_AHMADMUZAKKIKHAIRA;

public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape bentuk) {
        System.out.println("Computing amount for " + bentuk);
        return bentuk.area() / coverage;
    }
}