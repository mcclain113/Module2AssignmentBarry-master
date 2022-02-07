package edu.wctc;

public class Kitchen extends Room {
    public Kitchen(String name) {
        super(name);
    }

    @Override
    public void getDescription() {
        System.out.println("Something smells good in the Kitchen");
    }

    @Override
    public void getExits() {
        System.out.println("Exits are east, west, and south");
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
