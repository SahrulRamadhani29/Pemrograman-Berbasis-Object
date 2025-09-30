public class Baterai {
    private String merk;
    private int kapasitas;

    public Baterai() {}
    public Baterai(String merk, int kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }

    public String getMerk() { 
        return merk; 
    }
    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getKapasitas() { 
        return kapasitas; 
    }
    public void setKapasitas(int kapasitas) { 
        this.kapasitas = kapasitas; 
    }

    public String info() {
        String s = "";
        s += "Baterai\n";
        s += "- Merk       : " + merk + "\n";
        s += "- Kapasitas  : " + kapasitas + " mAh\n";
        return s;
    }
}
