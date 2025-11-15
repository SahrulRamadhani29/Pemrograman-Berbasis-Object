package Polimorfisme;

public class Manusia {

    public void MakanBuah (Buah x){
        if (x instanceof Apel){
        System.out.println("Apel langsung dimakan");
        ((Apel)x).TampilkanBiji();
        ((Apel)x).kandunganAir();
    }
    else if (x instanceof Pisang){
        System.out.println("Pisang dikupas dulu baru dimakan");
        ((Pisang)x).TampilkanKulit();
        ((Pisang)x).kandunganAir();
    }
    else if (x instanceof Durian) {
        System.out.println("Durian Harus di Belah dahulu untuk memakan Isi Buahnya");
        ((Durian)x).TampilkanDurinya();
        ((Durian)x).kandunganAir();
    }
    System.out.println("Rasanya: " + x.Rasa);
}
}

