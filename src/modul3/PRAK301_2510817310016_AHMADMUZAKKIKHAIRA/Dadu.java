package modul3.PRAK301_2510817310016_AHMADMUZAKKIKHAIRA;

public class Dadu {
    private int angkaDadu;

    public Dadu() {
        lemparDadu();
    }

    public void lemparDadu() {
        angkaDadu = (int) (Math.random() * 6) + 1;
    }

    public int getNilai() {
        return angkaDadu;
    }
}