package Polimorfisme;

public class Apel extends Buah {
    public Apel(){
        Rasa = "Manis agak asem";
    }

    public void TampilkanBiji (){
        System.out.println("Biji apel berukuran kecil");
    }

    public void kandunganAir (){
        System.out.println("Kandungan air apel adalah 70%");
    }

    public void warnaBuah() {
        System.out.println("Warna buah apel adalah merah");
    }
}
