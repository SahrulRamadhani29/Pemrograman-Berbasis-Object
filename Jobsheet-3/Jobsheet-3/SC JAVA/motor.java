public class motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanmesin(){
        kontakOn = true;
    }

    public void matikanmesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan (){
        if (kontakOn == true) {
            if (kecepatan == 100) {
                System.out.println("Kecepatan maksimal 100! \n");
            }
            else {kecepatan += 5;
            }
        }
        else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off");
            
        }
    }

    public void kurangiKecepatan(){
        if (kontakOn) {
            kecepatan -=5;
        }
        else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn== true) {
            System.out.println("Kontak On.");
        }
        else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan +"\n");
    }
}