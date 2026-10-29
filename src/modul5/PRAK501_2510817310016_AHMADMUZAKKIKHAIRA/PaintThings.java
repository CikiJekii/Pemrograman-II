package modul5.PRAK501_2510817310016_AHMADMUZAKKIKHAIRA;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;

        Paint paint = new Paint(COVERAGE);

        Rectangle deck = new Rectangle(20, 30);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        double kebutuhanDeck = paint.amount(deck);
        double kebutuhanBola = paint.amount(bigBall);
        double kebutuhanTabung = paint.amount(tank);

        DecimalFormat format = new DecimalFormat("0.#");

        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + format.format(kebutuhanDeck));
        System.out.println("Big Ball " + format.format(kebutuhanBola));
        System.out.println("Tank " + format.format(kebutuhanTabung));
    }
}