package modul2.PRAK203_2510817310016_AHMADMUZAKKIKHAIRA;

// Pada baris ini terjadi error karena nama public class
// harus sama dengan nama file.
// Nama file adalah Pegawai.java, sehingga class harus bernama Pegawai.
// public class Employee {

public class Pegawai {

    public String nama;

    // Pada baris ini terjadi error karena char hanya dapat
    // menyimpan satu karakter, sedangkan asal berupa String.
    // public char asal;
    public String asal;

    public String jabatan;

    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada baris ini terjadi error karena method tidak memiliki
    // parameter j, tetapi variabel j digunakan di dalam method.
    // public void setJabatan() {
    //     this.jabatan = j;
    // }

    public void setJabatan(String j) {
        this.jabatan = j;
    }
}