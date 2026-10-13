package modul3.PRAK303_2510817310016_AHMADMUZAKKIKHAIRA;

public class Mahasiswa {
    private String namaMahasiswa;
    private String nim;

    public Mahasiswa(String namaMahasiswa, String nim) {
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public String getNim() {
        return nim;
    }
}