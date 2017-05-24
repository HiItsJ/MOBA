import java.awt.Image;

public abstract class Moba_Legend {

    String name;
    Image image;
    int xPosition;
    int yPosition;
    double direction;
    double health;

    public abstract void qAbility();

    public abstract void wAbility();

    public abstract void eAbility();

    public void subtractHealth(double amount) {
        this.health = this.health - amount;
    }

    public void gainHealth(double amount) {
        this.health = this.health + amount;
    }
}
