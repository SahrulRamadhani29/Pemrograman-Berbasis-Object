public class Kamera {
    private String merk;
    private int jumlahKamera; 
    private int resolusi;     

    public Kamera() {}
    public Kamera(String merk, int jumlahKamera, int resolusi) {
        this.merk = merk;
        this.jumlahKamera = jumlahKamera;
        this.resolusi = resolusi;
    }

    public String getMerk() { 
        return merk; 
    }
    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getJumlahKamera() { 
        return jumlahKamera; 
    }
    public void setJumlahKamera(int jumlahKamera) { 
        this.jumlahKamera = jumlahKamera; 
    }

    public int getResolusi() { 
        return resolusi; 
    }
    public void setResolusi(int resolusi) { 
        this.resolusi = resolusi; 
    }

    public String info() {
        String s = "";
        s += "- Merk          : " + merk + "\n";
        s += "- Jumlah Lensa  : " + jumlahKamera + "\n";
        s += "- Resolusi Utama: " + resolusi + " MP\n";
        return s;
    }
}
