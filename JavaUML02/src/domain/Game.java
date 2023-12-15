package domain;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private WaterGun waterGun;
    
    void setUp(ArrayList<Player> players, WaterGun waterGun){
        setPlayers(players);
        setWaterGun(waterGun);
    }
    
    void play() {        
        for (Player player : getPlayers()) {
            player.shoot(getWaterGun());
            if (player.isWet()) {
                System.out.println("El jugador que se mojó es: " + player.getName());
                break;
            }
        }
    }
    
    // constructors
    public Game() {
    }

    public Game(ArrayList<Player> players, WaterGun waterGun) {
        this.players = players;
        this.waterGun = waterGun;
    }
    
    // getters & setters
    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public WaterGun getWaterGun() {
        return waterGun;
    }

    public void setWaterGun(WaterGun waterGun) {
        this.waterGun = waterGun;
    }
    
}
