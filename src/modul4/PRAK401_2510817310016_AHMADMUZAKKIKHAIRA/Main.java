package modul4.PRAK401_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine();
        String ras = scanner.nextLine();

        HewanPeliharaan hewan =
                new HewanPeliharaan(nama, ras);

        hewan.display();

        scanner.close();
    }
}