
package modul3.PRAK302_2510817310016_AHMADMUZAKKIKHAIRA;

import java.util.HashMap;

public class Negara {
    private String namaNegara;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String namaNegara, String jenisKepemimpinan,
                  String namaPemimpin, int tanggalKemerdekaan,
                  int bulanKemerdekaan, int tahunKemerdekaan) {
        this.namaNegara = namaNegara;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public Negara(String namaNegara, String jenisKepemimpinan,
                  String namaPemimpin) {
        this.namaNegara = namaNegara;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
    }

    public void cetakNegara(HashMap<Integer, String> namaBulan) {
        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Negara " + namaNegara
                    + " mempunyai Raja bernama " + namaPemimpin);
        } else {
            String jabatanPemimpin = "";

            if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
                jabatanPemimpin = "Presiden";
            } else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")) {
                jabatanPemimpin = "Perdana Menteri";
            }

            String bulan = namaBulan.get(bulanKemerdekaan);

            System.out.println("Negara " + namaNegara
                    + " mempunyai " + jabatanPemimpin
                    + " bernama " + namaPemimpin);

            System.out.println("Deklarasi Kemerdekaan pada Tanggal "
                    + tanggalKemerdekaan + " " + bulan + " "
                    + tahunKemerdekaan);
        }

        System.out.println();
    }
}
