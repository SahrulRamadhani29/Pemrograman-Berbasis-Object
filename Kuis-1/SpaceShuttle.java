public class SpaceShuttle {
private String kode;
private int Berat;
private Roket RoketUtama;
private Generator GeneratorUtama;

    public SpaceShuttle() {
    }
    public SpaceShuttle(String kode, int Berat, Roket RoketUtama, Generator GeneratorUtama) {
        this.kode = kode;
        this.Berat = Berat;
        this.RoketUtama = RoketUtama;
        this.GeneratorUtama = GeneratorUtama;
    }
    public String getKode() {
        return kode;
        }
        
    public void setKode (String kode) {
        this.kode = kode;
        }

    public int getBerat() {
        return Berat;
        }

    public void setBerat (int Berat) {
        this.Berat = Berat;
        }

    public Roket getRoketUtama() {
        return RoketUtama;
        }

    public void setRoketUtama (Roket RoketUtama) {
        this.RoketUtama = RoketUtama;
        }

    public Generator getGeneratorUtama() {
        return GeneratorUtama;
        }

    public void setGeneratorUtama (Generator GeneratorUtama) {
        this.GeneratorUtama = GeneratorUtama;
        }
    
}