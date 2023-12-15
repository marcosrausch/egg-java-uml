package domain;

public class Player {
    private byte Id;
    private String name;
    private boolean wet;
    
    void shoot(WaterGun waterGun) {
        if (waterGun.shoot()) {
            setWet(true);
        }
        waterGun.next();
    }
    
    // constructor
    public Player(byte id) {
        this.Id = id;
        this.name = "player" + this.Id;
        this.wet = false;
    }
    
    // getters & setters
    public byte getId() {
        return Id;
    }

    public void setId(byte Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWet() {
        return wet;
    }

    public void setWet(boolean wet) {
        this.wet = wet;
    }
}
