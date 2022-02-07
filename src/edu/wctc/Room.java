package edu.wctc;

public abstract class Room implements Exitable, Lootable, Interactable {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public void setNorth(Room north) {
        this.north = north;
    }

    @Override
    public int interactPoints() {
        return Interactable.super.interactPoints();
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room (String name)
    {
        this.name = name;
    }


    @Override
    public int lootPoints() {
        return Lootable.super.lootPoints();
    }

    public abstract void getDescription ();
        //The String will be displayed to the Player when they enter the Room and should contain a description of what they see.



    public Room getAdjoiningRoom (String x) {
        //if this Room is connected to another Room in the given direction,
        if(x == "n" && !north.equals("")){
            return north;
        }
        else if (x == "e" && !east.equals("")){
            return east;
        }
        else if (x == "w" && !west.equals("")){
            return west;
        }
        else if (x == "s" && !south.equals("")){
            return south;
        }
        else{
        return null;
        }
    }

    public abstract void getExits();
        //returns a String. The String should be a list of all of the directions the Player could exit from this Room to another Room.


    public String getName() {
        return name;
    }

    public boolean isValidDirection(String  direction){
//accepts a char argument for the direction. If this Room is connected to another Room in the given direction, return true.
// Otherwise, return false.
        if(direction == "n" && north != null){
            return true;
        }
        else if (direction == "e" && east != null) {
            return true;
        }
        else if (direction == "w" && west != null){
            return true;
        }
        else if (direction == "s" && south != null){
            return true;
        }
        else{
            return false;
        }
    }

    public abstract String loot();

    public abstract void IsInteractable();

    public abstract String interact(Player x);

    public abstract Boolean interactStatus();

    public abstract void IsExitable();

    public abstract String exit(Player x);

    public abstract Boolean exitStatus();

    public void getAdjoiningRoom() {
    }
}
