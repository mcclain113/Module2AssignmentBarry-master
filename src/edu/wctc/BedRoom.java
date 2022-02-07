package edu.wctc;

public class BedRoom extends Room{
    public BedRoom(String name) {
        super(name);
    }

    @Override
    public int lootPoints() {
        return 10;
    }

    @Override
    public String islootable() {
        return "Gold watch";
    }

    @Override
    public Boolean lootStatus() {
        return true;
    }

    @Override
    public String takeLoot(Player x) {
        return "Cool. You found a gold watch.";


    }

    @Override
    public void getDescription() {
        System.out.println("Looks cozy in the bedroom.  Wonder if there are any goodies?");
    }

    @Override
    public void getExits() {
        System.out.println("Can only exit west.");
    }

    @Override
    public String loot() {

        return "Gold Watch, ";
    }

    @Override
    public void IsInteractable() {

    }

    @Override
    public String interact(Player x) {
        return "There is nothing to interact with";
    }

    @Override
    public Boolean interactStatus() {
        return false;
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
}
