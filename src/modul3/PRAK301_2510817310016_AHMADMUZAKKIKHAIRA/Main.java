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

        for (int i = 0; i < listDadu.size(); i++) {
            int nilaiDadu = listDadu.get(i).getNilai();

            System.out.println("Dadu ke-" + (i + 1)
                    + " bernilai " + nilaiDadu);

            totalNilai += nilaiDadu;
        }

        System.out.println("Total nilai dadu keseluruhan "
                + totalNilai);

        scanner.close();
    }
}