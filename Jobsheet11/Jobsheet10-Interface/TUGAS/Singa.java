package Jobsheet11.TUGAS;

public class Singa extends Binatang implements IKarnivora {

    public Singa(String nama, String suara, String warnaBulu, int jumlahKaki) {
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis: Karnivora");
        System.out.println("Makanan: Daging");
    }
}
