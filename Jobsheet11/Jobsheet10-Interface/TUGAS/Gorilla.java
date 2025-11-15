package Jobsheet11.TUGAS;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    public Gorilla(String nama, String suara, String warnaBulu, int jumlahKaki) {
        super(nama, suara, warnaBulu, jumlahKaki);
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis: Karnivora + Herbivora");
        System.out.println("Makanan: Daging + Tumbuhan");
    }
}
