package org.example.snakesLadders;

public class Player {
    int id;
    String name;
    int location;
    public Player(String name, int id){
        this.name = name;
        this.id = id;
        this.location = 0;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Name of the player" + this.name + " id:-"+ this.id;
    }
}
