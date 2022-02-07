package edu.wctc;

public interface Lootable {
    Boolean isLootable = false;
    int lootPoints = 0;
    default int lootPoints(){
        return lootPoints;
    }
    String islootable();
    default Boolean lootStatus(){
        return isLootable;
    }
    default String takeLoot(Player x){
        String s = "Shucks! Nothing to loot here in the" + " " + Room.class.getName() + ".";
        return s;}

}
