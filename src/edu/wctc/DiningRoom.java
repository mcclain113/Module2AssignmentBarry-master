package edu.wctc;

public class DiningRoom extends Room implements Interactable{
    public DiningRoom(String name) {
        super(name);
    }

    @Override
    public void IsInteractable() {

    }

    @Override
    public int interactPoints() {
        return -5;
    }

    @Override
    public String interact(Player x) {
        return "The floor is slippery.  You just wiped out.";
    }

    @Override
    public Boolean interactStatus() {
        return true;
    }

    @Override
    public void getDescription() {
        System.out.println("You made it into the dining room. Very quiet in here.");
    }

    @Override
    public void getExits() {
        System.out.println("Exits are east and west.");
    }

    @Override
    public void IsExitable() {

    }

    @Override
    public String exit(Player x) {
        return "No Exit.";
    }

    @Override
    public Boolean exitStatus() {
        return false;
    }



    @Override
    public String ExitIt(Player x) {
        return super.ExitIt(x);
    }

    @Override
    public Boolean ExitStatus() {
        return super.ExitStatus();
    }

    @Override
    public String loot() {

        return null;
    }

    @Override
    public String islootable() {

        return null;
    }

    @Override
    public Boolean lootStatus() {
        return super.lootStatus();
    }

    @Override
    public String takeLoot(Player x) {
        return super.takeLoot(x);
    }
}
