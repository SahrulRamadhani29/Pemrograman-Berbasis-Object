package Jobsheet11.TUGAS;
public class MainBinatang {
    public static void main(String[] args) {

        Keledai keledai = new Keledai("Keledai Malika", "Whehehehe", "Abu-Abu", 4);
        Gorilla gorilla = new Gorilla("Golila", "HRAWHHH HRAWHHH", "Hitam Manis dan imut", 4);
        Singa singa = new Singa("Cinga", "EVOSS ROARRR", "Coklat Kekuningan", 4);

        keledai.displayMakanan();
        keledai.tampilInfo();
        System.out.println();

        gorilla.displayMakanan();
        gorilla.tampilInfo();
        System.out.println();

        singa.displayMakanan();
        singa.tampilInfo();
    }
}
