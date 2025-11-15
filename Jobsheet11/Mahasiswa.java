package Jobsheet11;
public class Mahasiswa implements ICumlaude {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void perkenalan() {
        System.out.println("Aku mahasiswa, namaku " + nama);
    }

    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, Namaku " + nama + ", Aku kuliah di kampus");
        System.out.println("Aku berkuliah di kampus");
    }
    
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan tugas akhir");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-ku lebih dari 3,00");
    }

}
