import java.util.Scanner;

public class PRAK101_2510817310016_AHMADMUZAKKIKHAIRA {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nama Lengkap: ");
    String nama = input.nextLine();

    System.out.print("Masukkan Tempat Lahir: ");
    String tempat = input.nextLine();

    System.out.print("Masukkan Tanggal Lahir: ");
    int tgl = input.nextInt();

    System.out.print("Masukkan Bulan Lahir: ");
    int bulan = input.nextInt();

    System.out.print("Masukkan Tahun Lahir: ");
    int tahun = input.nextInt();

    System.out.print("Masukkan Tinggi Badan: ");
    int tb = input.nextInt();

    System.out.print("Masukkan Berat Badan: ");
    double bb = input.nextDouble();

    String[] namaBulan = {
            "", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };

    System.out.println("\nOutput");
    System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + tgl + " " + namaBulan[bulan] + " " + tahun);
    System.out.println("Tinggi Badan " + tb + " cm dan Berat Badan " + bb + " kilogram");

    input.close();
    }
}

