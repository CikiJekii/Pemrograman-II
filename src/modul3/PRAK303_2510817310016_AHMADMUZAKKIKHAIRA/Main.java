package modul3.PRAK303_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");

            String inputMenu = scanner.nextLine().trim();
            int menu;

            try {
                menu = Integer.parseInt(inputMenu);
            } catch (NumberFormatException e) {
                System.out.println("Pilihan harus berupa angka.");
                continue;
            }

            if (menu == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String namaMahasiswa = scanner.nextLine().trim();

                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = scanner.nextLine().trim();

                boolean ditemukan = false;

                for (Mahasiswa m : listMahasiswa) {
                    if (m.getNim().equals(nim)) {
                        ditemukan = true;
                        break;
                    }
                }

                if (ditemukan) {
                    System.out.println("NIM sudah digunakan.");
                } else {
                    listMahasiswa.add(new Mahasiswa(namaMahasiswa, nim));
                    System.out.println(
                            "Mahasiswa " + namaMahasiswa + " ditambahkan.");
                }

            } else if (menu == 2) {
                System.out.print("Masukkan NIM yang akan dihapus: ");
                String nimHapus = scanner.nextLine().trim();

                boolean ditemukan = false;

                for (int i = 0; i < listMahasiswa.size(); i++) {
                    if (listMahasiswa.get(i).getNim().equals(nimHapus)) {
                        listMahasiswa.remove(i);
                        ditemukan = true;
                        System.out.println(
                                "Mahasiswa dengan NIM " + nimHapus
                                        + " berhasil dihapus.");
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa tidak ditemukan.");
                }

            } else if (menu == 3) {
                System.out.print("Masukkan NIM yang dicari: ");
                String nimCari = scanner.nextLine().trim();

                boolean ditemukan = false;

                for (Mahasiswa m : listMahasiswa) {
                    if (m.getNim().equals(nimCari)) {
                        System.out.println(
                                "Nama: " + m.getNamaMahasiswa());
                        System.out.println("NIM: " + m.getNim());
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Mahasiswa tidak ditemukan.");
                }

            } else if (menu == 4) {
                if (listMahasiswa.isEmpty()) {
                    System.out.println("Belum ada data mahasiswa.");
                } else {
                    System.out.println("Daftar Mahasiswa:");

                    for (Mahasiswa m : listMahasiswa) {
                        System.out.println(
                                "NIM: " + m.getNim()
                                        + ", Nama: " + m.getNamaMahasiswa());
                    }
                }

            } else if (menu == 0) {
                listMahasiswa.clear();
                System.out.println("Terima kasih!");
                break;

            } else {
                System.out.println("Pilihan menu tidak tersedia.");
            }
        }

        scanner.close();
    }
}
