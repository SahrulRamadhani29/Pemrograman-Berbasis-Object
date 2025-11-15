package Jobsheet11.TUGAS;

public class Keledai extends Binatang implements IHerbivora {

    public Keledai(String nama, String suara, String warnaBulu, int jumlahKaki) {
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis: Herbivora");
        System.out.println("Makanan: Tumbuhan");
    }
}
