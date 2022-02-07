package edu.wctc;

public interface Interactable {


    Boolean isInteractable = false;
    int interactPoints = 0;

    default int interactPoints() {
        return interactPoints;
    }
    void IsInteractable();

    default String interact(Player x) {
        return "There is nothing to interact with";
    }

    default Boolean interactStatus() {
        return isInteractable;
    }
}



