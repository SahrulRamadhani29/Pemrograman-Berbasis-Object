public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif = 1;

    public Televisi() {
    }
    public Televisi(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
    }

    public String getMerek() {
        return merek;
    }
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getJumlahChannel() {
        return jumlahChannel;
    }
    public void setJumlahChannel(int jumlahChannel) {
        this.jumlahChannel = jumlahChannel;
    }

    public void pindahChannel(int ChannelBaru){
            channelAktif = ChannelBaru;
    }
    
    public int getChannelAktif() {
        return channelAktif;
    }
}