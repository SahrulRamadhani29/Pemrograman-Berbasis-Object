public class koperasi {
    private String nomorKTP;
    private String nama;
    private float limitPinjaman;
    private float pinjaman;
    private float meminjam;

    koperasi (String nomorKTP, String nama, float limitPinjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public void setNomorKTP (String nomorKTP){
        this.nomorKTP = nomorKTP;
    }
    public void setNama (String nama){
        this.nama = nama;
    }

    public void setLimitPinjaman (float limitPinjaman){
        this.limitPinjaman = limitPinjaman;
    }
    public void setPinjaman (float Pinjaman){
        this.pinjaman = Pinjaman;
    }
    public String getNomorKTP (){
        return nomorKTP;
    }

    public String getNama (){
        return nama;
    }

    public float getLimitPinjaman (){
        return limitPinjaman;
    }
    
    public void meminjam (float uang){
        if (uang > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            System.out.println("Anda ingin meminjam : " + uang );
            System.out.println("Sedangkan Limit pinjaman Anda : " + limitPinjaman);
        } else {
            pinjaman += uang;
            System.out.println("Meminjam Uang " + pinjaman);
            System.out.println("Jumlah pinjaman saat ini : " + pinjaman);
        }
    }

    public void membayar (float uang){
        if (uang < 0.1*pinjaman) {
            System.out.println("jumlah nominal angsuran minimal 10% dari totalpinjaman");
            System.out.println("anda harus membayar minimal : " + 0.1*pinjaman);
        } else {
            pinjaman -= uang;
            System.out.println("Melakukan pembayaran sejumlah " + uang);
            System.out.println("Jumlah pinjaman saat ini : " + pinjaman);
        }
    }

}
