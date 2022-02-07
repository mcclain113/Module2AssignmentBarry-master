package edu.wctc;

public class LivingRoom extends Room {
    public LivingRoom(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("You are at the house entrance. You are in the living room.");
    }

    @Override
    public void getExits() {
        System.out.println("The only exit is north");
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
        return false;
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


}

