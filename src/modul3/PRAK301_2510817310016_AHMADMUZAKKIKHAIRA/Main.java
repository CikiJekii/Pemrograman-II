package modul3.PRAK301_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Dadu> listDadu = new LinkedList<>();

        int jumlahDadu = scanner.nextInt();
        int totalNilai = 0;

        for (int i = 0; i < jumlahDadu; i++) {
            Dadu daduBaru = new Dadu();
            listDadu.add(daduBaru);
        }

        int nomorDadu = 1;

        for (Dadu dadu : listDadu) {
            int nilaiDadu = dadu.getNilai();

            System.out.println("Dadu ke-" + nomorDadu
                    + " bernilai " + nilaiDadu);

            totalNilai += nilaiDadu;
            nomorDadu++;
        }

        System.out.println("Total nilai dadu keseluruhan "
                + totalNilai);

        scanner.close();
    }
}