package Polimorfisme;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double factor = 0.0;
        switch (level) {
            case 1: factor = 0.20; break; // +20%
            case 2: factor = 0.30; break; // +30%
            case 3: factor = 0.40; break; // +40%
            default: factor = 0.0; break;
        }
        int added = (int) Math.ceil(this.health * factor);
        this.health += added;
    }

    @Override
    public void destroyed() {
        // sesuai contoh: setiap kali penghancuran health dikalikan 0.8 (berkurang 20%)
        double newHealth = this.health * 0.8;
        this.health = (int) Math.ceil(newHealth); // gunakan ceil agar hasil sesuai contoh
    }

    @Override
    public String getZombieInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Walking Zombie Data =\n");
        sb.append("Health = ").append(this.health).append("\n");
        sb.append("Level = ").append(this.level).append("\n");
        return sb.toString();
    }
}
