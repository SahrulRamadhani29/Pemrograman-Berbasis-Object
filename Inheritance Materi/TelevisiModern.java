public class TelevisiModern extends Televisi {
    
    private String modusTampilan;
    private String dvd;
    
    public TelevisiModern(String merek, int jumlahChannel) {
        merek = merek;
        jumlahChannel = jumlahChannel;
    }

    public void gantiModusTampilan(String modusTampilanBaru){
        modusTampilan = modusTampilanBaru;
    }

        public String getDvd() {
        return dvd;
    }

    public String getModusTampilan() {
        return modusTampilan;
    }

    public void setModusTampilan(String modusTampilan) {
        this.modusTampilan = modusTampilan;
    }

    public void mainkanDVD(){
        if (dvd != null){
            System.out.println("Sedang Memainkan DVD : " + dvd);
        } else {
            System.out.println("Sedang Memainkan DVD : Kosong");
        }
    }

    public void masukanDVD(String dvdBaru){
        dvd = dvdBaru;
    }


}
