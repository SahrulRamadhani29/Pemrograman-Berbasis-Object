public class MainSmartphone {
    public static void main(String[] args) {
        Processor proc = new Processor("Snapdragon 8 Gen 2", 8);
        Baterai bat = new Baterai("BYD", 5000);
        Kamera camDepan = new Kamera("Sony", 1, 32);    
        Kamera camBelakang = new Kamera("Sony", 3, 50);  

        Smartphone hp = new Smartphone(
                "Oviv X1", 256, 12,
                bat, camDepan, camBelakang, proc
        );

        System.out.println(hp.info());
    }
}
