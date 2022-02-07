package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score = 0;
    private List<String> inventory = new ArrayList<String>();



    public void addToinventory (String x){
        //accepts a String argument and adds it to the Player's inventory list
        String newInventory = x;
        inventory.add(newInventory);
    }
    public void addtoScore (int y){
        //accepts an int argument and adds it to the Player's score.
        score += y;
    }

    public List<String> getInventory(){
        if (inventory.isEmpty() == true){
            System.out.println("You have no inventory.");}
        else{
            System.out.println(inventory);}

        return null;
    }

    public int getScore() {
            return score;
        //return's the Player's score field (an int)

    }

    public void addToinventory() {
    }
}
