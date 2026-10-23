package modul4.PRAK402_2510817310016_AHMADMUZAKKIKHAIRA;

public class Kucing extends HewanPeliharaan {
    private String warnaBulu;

    public Kucing(String nama, String ras, String warnaBulu) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}