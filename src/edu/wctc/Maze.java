package edu.wctc;

import java.util.List;

public class Maze<setPlayer> {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;


    public void SetPlayer() {
        Player player1 = new Player();
        player = player1;
    }
    //A constructor that creates a Player object and assigns it to the field.


    public Maze() {
//The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods. The Room in which the Player begins the game is assigned to the currentRoom field.

        LivingRoom livingRoom = new LivingRoom("Living Room");
        Kitchen kitchen = new Kitchen("Kitchen");
        DiningRoom diningRoom = new DiningRoom("Dining Room");
        BedRoom bedRoom = new BedRoom("Bedroom");
        Den den = new Den("Den");

        livingRoom.setNorth(kitchen);
        kitchen.setEast(diningRoom);
        kitchen.setWest(den);
        kitchen.setSouth(livingRoom);
        diningRoom.setEast(bedRoom);
        diningRoom.setWest(kitchen);
        bedRoom.setWest(diningRoom);
        currentRoom = livingRoom;
        den.setEast(kitchen);
    }

    public String exitCurrentRoom() {
        //returns a String. If the currentRoom is an Exit, it returns the result of calling exit() on the Room.
        // If not, it returns a message that the current room is not exitable.
        //If (){
        boolean status = currentRoom.exitStatus();

        if (status = true){
            return currentRoom.exit(player) ;
        }
        return "There is no exit here.";
        }




    public String interactWithCurrentRoom() {
        //returns a String. If the currentRoom is Interactable, it returns the result of calling interact on the Room.
        // If not, it returns a message that no interactions are possible.
        boolean status = currentRoom.interactStatus();

        if (status = true){
            return
                    currentRoom.interact(player) ;
        }

            return "Shucks! Nothing to loot here.";
    }


    public String lootCurrentRoom() {
        //returns a String. If the currentRoom is Lootable, it returns the result of calling loot on the Room.
        // If not, it returns a message that the current room is not lootable.

        boolean status = currentRoom.lootStatus();

        if (status = true){
      return      currentRoom.takeLoot(player);




        }

           return "Shucks! Nothing to loot here";
    };

    public boolean move(String x) {
        //returns a boolean. If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true.
        if (currentRoom.isValidDirection(x)){
            return true;
        }
        
        // If not, the method returns false.

        return false;
    }


    public int getPlayerScore() {
        //return the result of calling the Player's getScore
        return player.getScore();
    }

    public List<String> getPlayerInventory() {
        //return the result of calling the Player's getInventory
       return player.getInventory();

    }

    public void addIntoScore(int x){
        player.addtoScore(x);
    }

public void addIntoInventory() {
        player.addToinventory(currentRoom.islootable());
}

    public void getCurrentRoomDescription() {
        //return the result of calling the getDescription method of the currentRoom
        currentRoom.getDescription();
    }


    public void getCurrentRoomExits() {
        //return the result of calling the getExits method of the currentRoom
        currentRoom.getExits();
    }


    public boolean isFinished() {
        // returns the Maze's isFinished field (a boolean).
        return false;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public void setCurrentRoom() {
    }


    public void setPlayer() {
    }
}



