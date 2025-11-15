public class Roket {
    private String Tipe;
    private int power;

    public Roket (){
    }
    public Roket (String Tipe, int power) {
        this.Tipe = Tipe;
        this.power = power;
    }

    public String getTipe() {
        return Tipe;
    }
    public void setTipe(String Tipe) {
        this.Tipe = Tipe;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
}
