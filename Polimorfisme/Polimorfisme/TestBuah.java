package Polimorfisme;
public class TestBuah {
    public static void main(String[] args) {
        Manusia ilham = new Manusia();
        
        Apel myApel = new Apel();
        Pisang myPisang = new Pisang();
        Durian durianku = new Durian();

        ilham.MakanBuah(myApel);
        System.out.println();
        ilham.MakanBuah(durianku);
        System.out.println();
        ilham.MakanBuah(myPisang);
    }
}
