package Polimorfisme;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        double factor = 0.0;
        switch (level) {
            case 1: factor = 0.30; break; // +30%
            case 2: factor = 0.40; break; // +40%
            case 3: factor = 0.50; break; // +50%
            default: factor = 0.0; break;
        }
        int added = (int) Math.ceil(this.health * factor);
        this.health += added;
    }

    @Override
    public void destroyed() {
        // sesuai contoh: setiap kali penghancuran health dikalikan 0.9 (berkurang 10%)
        double newHealth = this.health * 0.9;
        this.health = (int) Math.ceil(newHealth); // ceil untuk mendapatkan nilai sesuai contoh
    }

    @Override
    public String getZombieInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jumping Zombie Data =\n");
        sb.append("Health = ").append(this.health).append("\n");
        sb.append("Level = ").append(this.level).append("\n");
        return sb.toString();
    }
}
