public class Smartphone {
    private String merk;
    private int memori; 
    private int ram;   

    private Baterai baterai;
    private Kamera kameraDepan;
    private Kamera kameraBelakang;
    private Processor processor;

    public Smartphone() {}

    public Smartphone(String merk, int memori, int ram,
                      Baterai baterai, Kamera kameraDepan,
                      Kamera kameraBelakang, Processor processor) {
        this.merk = merk;
        this.memori = memori;
        this.ram = ram;
        this.baterai = baterai;
        this.kameraDepan = kameraDepan;
        this.kameraBelakang = kameraBelakang;
        this.processor = processor;
    }

    public String getMerk() {
        return merk; 
    }
    public void setMerk(String merk) { 
        this.merk = merk; 
    }

    public int getMemori() { 
        return memori; 
    }
    public void setMemori(int memori) { 
        this.memori = memori; 
    }

    public int getRam() { 
        return ram; 
    }
    public void setRam(int ram) { 
        this.ram = ram; 
    }

    public Baterai getBaterai() { 
        return baterai; 
    }
    public void setBaterai(Baterai baterai) { 
        this.baterai = baterai; 
    }

    public Kamera getKameraDepan() { 
        return kameraDepan; 
    }
    public void setKameraDepan(Kamera kameraDepan) { 
        this.kameraDepan = kameraDepan; 
    }

    public Kamera getKameraBelakang() { 
        return kameraBelakang; 
    }
    public void setKameraBelakang(Kamera kameraBelakang) { 
        this.kameraBelakang = kameraBelakang; 
    }

    public Processor getProcessor() { 
        return processor; 
    }
    public void setProcessor(Processor processor) { 
        this.processor = processor; 
    }

    public String info() {
        String s = "";
        s += "SPESIFIKASI SMARTPHONE : \n";
        s += "- Merk : " + merk + "\n"; 
        s += "- Memori : " + memori + " GB\n";
        s += "- RAM : " + ram + " GB\n\n"; 
        s += processor.info() + "\n"; 
        s += baterai.info() + "\n"; 
        s += "Kamera Depan:\n"; 
        s += kameraDepan.info() + "\n"; 
        s += "Kamera Belakang:\n"; 
        s += kameraBelakang.info() + "\n"; 
        return s;
}
}
