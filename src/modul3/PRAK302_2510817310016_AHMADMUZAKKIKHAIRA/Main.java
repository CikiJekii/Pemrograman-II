package modul3.PRAK302_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();

        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahNegara; i++) {
            String namaNegara = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();

            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                listNegara.add(new Negara(
                        namaNegara, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = scanner.nextInt();
                int bulan = scanner.nextInt();
                int tahun = scanner.nextInt();
                scanner.nextLine();

                listNegara.add(new Negara(
                        namaNegara, jenisKepemimpinan, namaPemimpin,
                        tanggal, bulan, tahun));
            }
        }

        for (int i = 0; i < listNegara.size(); i++) {
            listNegara.get(i).cetakNegara(namaBulan);
        }

        scanner.close();
    }
}