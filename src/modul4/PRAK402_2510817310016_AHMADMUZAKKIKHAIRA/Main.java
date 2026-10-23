package modul4.PRAK402_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String nama = scanner.nextLine();

        System.out.print("Ras: ");
        String ras = scanner.nextLine();

        System.out.print("Warna Bulu: ");
        String warnaBulu = scanner.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(nama, ras, warnaBulu);
            kucing.displayDetailKucing();

        } else if (pilihan == 2) {
            System.out.print("Kemampuan : ");
            String inputKemampuan = scanner.nextLine();

            String[] kemampuan =
                    inputKemampuan.split("\\s*,\\s*");

            Anjing anjing = new Anjing(
                    nama, ras, warnaBulu, kemampuan);

            anjing.displayDetailAnjing();

        } else {
            System.out.println("Pilihan tidak tersedia.");
        }

        scanner.close();
    }
}
