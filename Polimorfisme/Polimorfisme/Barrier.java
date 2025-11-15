package Polimorfisme;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        // contoh menurunkan 10% per kali hancur, lalu gunakan floor (cast int)
        double newStr = this.strength * 0.9;
        this.strength = (int) newStr; // cast (floor) agar sesuai contoh output (64)
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength + "\n";
    }
}
