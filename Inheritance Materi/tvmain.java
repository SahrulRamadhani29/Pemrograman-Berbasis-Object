public class tvmain {
    public static void main(String[] args) {
        TelevisiModern tv = new TelevisiModern("Samsong", 100);
        System.out.println("Channel Aktif : " + tv.getChannelAktif());
        tv.pindahChannel(20);
        System.out.println("Channel Aktif Sekarang : " + tv.getChannelAktif());
        tv.gantiModusTampilan("HDMI");
        tv.mainkanDVD();
        tv.masukanDVD("The matrix");
        tv.mainkanDVD();   
    }
}
