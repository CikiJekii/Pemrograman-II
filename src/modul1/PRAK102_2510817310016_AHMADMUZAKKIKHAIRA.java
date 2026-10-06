package modul1;

import java.util.Scanner;

public class PRAK102_2510817310016_AHMADMUZAKKIKHAIRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan = input.nextInt();

        int i = 0;
        int angka = bilangan;

        while (i < 10) {
            int hasil;

            if (angka % 5 == 0) {
                hasil = (angka / 5) - 1;
            } else {
                hasil = angka;
            }

            if (i == 0) {
                System.out.print(hasil);
            } else {
                System.out.print("," + hasil);
            }

            angka++;
            i++;
        }

        System.out.println();
        input.close();
    }
}