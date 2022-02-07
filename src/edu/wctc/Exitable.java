package edu.wctc;

public interface Exitable {


    Boolean isExitable = false;
    void IsExitable();
    default String ExitIt(Player x){return "No exit.";}

    default Boolean ExitStatus(){
        return isExitable;
    }

}
