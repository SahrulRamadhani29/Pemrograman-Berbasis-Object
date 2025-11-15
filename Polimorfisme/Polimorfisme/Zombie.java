package Polimorfisme;

public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    // implementasi healing -- aturan berbeda di subclass
    public abstract void heal();

    // implementasi destroyed juga di override di subclass
    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Walking Zombie Data =\n");
        // Note: subclass may override label; but we'll let subclasses override method if needed.
        sb.append("Health = ").append(this.health).append("\n");
        sb.append("Level = ").append(this.level).append("\n");
        return sb.toString();
    }
}
