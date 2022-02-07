package edu.wctc;

public class Den extends Room {
    public Den(String name) {
        super(name);
    }

    @Override
    public void IsExitable() {

    }

    @Override
    public String exit(Player x) {
        return "You got out.";
    }

    @Override
    public Boolean exitStatus() {
        return true;
    }

    @Override
    public String ExitIt(Player x) {
        return "You got out of the house!";
    }

    @Override
    public Boolean ExitStatus() {
        return super.ExitStatus();
    }

    @Override
    public void getDescription() {
        System.out.println("What a mess in den. Looks like there is a door out.");
    }

    @Override
    public void getExits() {
        System.out.println("Exits are north and east.");
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
        return true;
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
