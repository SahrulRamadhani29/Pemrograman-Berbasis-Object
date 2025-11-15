package Jobsheet11.TUGAS;

public class Binatang {
    protected String nama;
    protected String suara;
    protected String warnaBulu;
    protected int jumlahKaki;

    public Binatang(String nama, String suara, String warnaBulu, int jumlahKaki) {
        this.nama = nama;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
        this.jumlahKaki = jumlahKaki;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah Kaki: " + jumlahKaki);
        System.out.println("Suara: " + suara);
        System.out.println("Warna Bulu: " + warnaBulu);
    }
}
