public class Generator {
    private int daya;
    private int voltase;


    public Generator() {}
    public Generator(int daya, int voltase) {
        this.daya = daya;
        this.voltase = voltase;
    }

    public int getDaya() {
        return daya;
    }
    public void setDaya(int daya) {
        this.daya = daya;
    }
    public int getvoltase() {
        return voltase;
    }
    public void setvoltase(int voltase) {
        this.voltase = voltase;
    }
}
