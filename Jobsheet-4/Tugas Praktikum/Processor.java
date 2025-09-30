public class Processor {
    private String merk;
    private int jumlahCore;

    public Processor() {}
    public Processor(String merk, int jumlahCore) {
        this.merk = merk;
        this.jumlahCore = jumlahCore;
    }

    public String getMerk() { 
        return merk; 
    }
    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getJumlahCore() { 
        return jumlahCore; 
    }
    public void setJumlahCore(int jumlahCore) { 
        this.jumlahCore = jumlahCore; 
    }

    public String info() {
        String s = "";
        s += "Processor\n";
        s += "- Merk        : " + merk + "\n";
        s += "- Jumlah Core : " + jumlahCore + "\n";
        return s;
    }
}
