import Jobsheet11.Mahasiswa;
import Polimorfisme.Manusia;

public class MainTugas {
    public static void main(String[] args) {
        Manusia m;

        System.out.println("Akses class Dosen");
        m = new Dosen();
        m.bernafas();
        m.makan();
        ((Dosen) m).lembur();

        System.out.println("=================");

        System.out.println("Akses class Mahasiswa");
        m = new Mahasiswa();
        m.bernafas();
        m.makan();
        ((Mahasiswa) m).tidur();

        System.out.println("=================");

        System.out.println("Akses class Parent Manusia");
        m = new Manusia();
        m.bernafas();
        m.makan();
    }
}
