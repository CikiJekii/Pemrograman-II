package modul4.PRAK402_2510817310016_AHMADMUZAKKIKHAIRA;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warnaBulu,
                  String[] kemampuan) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan;
    }

    public void displayDetailAnjing() {
        super.display();

        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");

        for (int i = 0; i < kemampuan.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }

            System.out.print(kemampuan[i]);
        }

        System.out.println();
    }
}