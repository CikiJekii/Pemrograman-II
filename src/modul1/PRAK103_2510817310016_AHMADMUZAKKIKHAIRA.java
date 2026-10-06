package modul1;

import java.util.Scanner;

public class PRAK103_2510817310016_AHMADMUZAKKIKHAIRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = input.nextInt();
        int bilanganAwal = input.nextInt();

        int penghitung = 0;
        int angka = bilanganAwal;

        do {
            if (angka % 2 != 0) {
                if (penghitung == 0) {
                    System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
                penghitung++;
            }
            angka++;
        } while (penghitung < total);

        System.out.println();
        input.close();
    }
}
